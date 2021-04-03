package org.royalix.qtokens.plugin.tool;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.oop.inteliframework.plugin.module.InteliModule;
import org.royalix.qtokens.api.module.ModuleProvider;
import org.royalix.qtokens.api.module.ToolModule;
import org.royalix.qtokens.api.util.data.SerializableObject;
import org.royalix.qtokens.api.util.data.SerializedData;
import org.royalix.qtokens.plugin.module.QModuleRegistry;

import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;

public interface ToolModuleHolder extends SerializableObject, InteliModule {

    @Override
    default void serialize(SerializedData data) {
        JsonArray array = new JsonArray();
        for (ToolModule value : getModules().values()) {
            JsonObject object = new JsonObject();

            ModuleProvider moduleProvider = platform()
                    .safeModuleByClass(QModuleRegistry.class)
                    .getProviderMap()
                    .get(value.getName());
            moduleProvider.serialize(value, new SerializedData(object));

            object.addProperty("__type__", value.getName());
            array.add(object);
        }

        data.getJsonElement().getAsJsonObject().add("modules", array);
    }

    @Override
    default void deserialize(SerializedData data) {
        for (ToolModule toolModule : data.getChildren("modules").map(sd -> sd.applyAsCollection().map(moduleData -> {
            String name = moduleData.getChildren("__type__")
                    .map(typeData -> typeData.applyAs(String.class))
                    .orElseThrow(() -> new IllegalStateException("Failed to find __type__ value in tool module, looks like module is corrupted!"));

            ModuleProvider moduleProvider = platform()
                    .safeModuleByClass(QModuleRegistry.class)
                    .getProviderMap()
                    .get(name);

            return moduleProvider.deserialize(moduleData);
        }).collect(Collectors.toList())).orElse(new ArrayList<>())) {
            getModules().put(toolModule.getName(), toolModule);
        }
    }

    Map<String, ToolModule> getModules();
}

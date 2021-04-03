package org.royalix.qtokens.plugin.module;

import com.oop.inteliframework.plugin.module.InteliModule;
import lombok.Getter;
import lombok.NonNull;
import org.royalix.qtokens.api.module.ModuleProvider;
import org.royalix.qtokens.api.module.ModuleRegistry;

import java.util.Map;
import java.util.TreeMap;

@Getter
public class QModuleRegistry implements ModuleRegistry, InteliModule {
    private final Map<String, ModuleProvider<?>> providerMap = new TreeMap<>(String::compareToIgnoreCase);

    @Override
    public <T extends ModuleProvider<?>> void register(@NonNull T moduleProvider) {
        providerMap.put(moduleProvider.getName(), moduleProvider);
    }
}

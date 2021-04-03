package org.royalix.qtokens.api.module;

import lombok.NonNull;
import org.royalix.qtokens.api.tool.Tool;
import org.royalix.qtokens.api.util.data.SerializedData;

/**
 * Used for creating modules for tools
 */
public interface ModuleProvider<T extends ToolModule> {

    /**
     * Can return null, that means that the tool is not accepted
     * @param tool the Tool that it's trying to provide module for
     * @return Nullable tool module
     */
    T provide(Tool tool);

    T deserialize(SerializedData data);

    void serialize(T module, SerializedData data);

    void doInit(T module);

    /**
     * Name of the module provider
     */
    @NonNull
    String getName();

}

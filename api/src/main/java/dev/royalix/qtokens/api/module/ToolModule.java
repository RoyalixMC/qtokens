package dev.royalix.qtokens.api.module;

import dev.royalix.qtokens.api.QPickaxes;
import dev.royalix.qtokens.api.QPickaxesAPI;
import dev.royalix.qtokens.api.tool.Tool;
import dev.royalix.qtokens.api.util.data.SerializedData;

/**
 * Class for handling tool module
 */
public interface ToolModule {
    /**
     * Get name of the module
     * @return the name of the module
     */
    String getName();

    /**
     * Returns tool that this module represents
     * @return Tool
     */
    Tool getTool();

    /**
     * Called once tool is initialized
     */
    void onInit();

    /**
     * Append to lore when itemStack is being built
     */
    void appendLore();

    /**
     * Called on deserialization
     */
    void onDeserialize(SerializedData data);

    /**
     * Called on serialization
     */
    void onSerialize(SerializedData data);

    /**
     * Get instance of the plugin
     * @return instance of the plugin
     */
    default QPickaxes getPlugin() {
        return QPickaxesAPI.getPlugin();
    }
}

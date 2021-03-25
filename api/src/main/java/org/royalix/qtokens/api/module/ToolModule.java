package org.royalix.qtokens.api.module;

import org.royalix.qtokens.api.QPickaxes;
import org.royalix.qtokens.api.QPickaxesAPI;
import org.royalix.qtokens.api.tool.Tool;
import org.royalix.qtokens.api.util.data.SerializedData;

/**
 * Class for handling tool module
 * This class when implemented must have an empty constructor
 */
public interface ToolModule {
    /**
     * Get name of the module
     * @return the name of the module
     */
    String getName();

    /**
     * Returns tool that this module represents
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
     */
    default QPickaxes getPlugin() {
        return QPickaxesAPI.getPlugin();
    }
}

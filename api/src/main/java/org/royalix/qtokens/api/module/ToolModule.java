package org.royalix.qtokens.api.module;

import org.checkerframework.checker.nullness.Opt;
import org.royalix.qtokens.api.QPickaxes;
import org.royalix.qtokens.api.QPickaxesAPI;
import org.royalix.qtokens.api.tool.Tool;

import java.util.Optional;

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
     * Get instance of the plugin
     */
    default QPickaxes getPlugin() {
        return QPickaxesAPI.getPlugin();
    }
}

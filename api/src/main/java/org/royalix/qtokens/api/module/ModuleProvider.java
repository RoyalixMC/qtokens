package org.royalix.qtokens.api.module;

import org.royalix.qtokens.api.tool.Tool;

/**
 * Used for creating modules for tools
 */
@FunctionalInterface
public interface ModuleProvider<T extends ToolModule> {

    /**
     * Can return null, that means that the tool is not accepted
     * @param tool the Tool that it's trying to provide module for
     * @return Nullable tool module
     */
    T provide(Tool tool);

}

package org.royalix.qtokens.api.module;

/**
 * Class used for handling modules
 */
public interface ModuleRegistry {

    /**
     * Register an module
     * @param moduleProvider a provider that provides specific module for tools
     */
    <T extends ModuleProvider<?>> void register(T moduleProvider);

}

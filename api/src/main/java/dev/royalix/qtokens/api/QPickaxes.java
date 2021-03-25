package dev.royalix.qtokens.api;

import dev.royalix.qtokens.api.currency.CurrencyRegistry;
import dev.royalix.qtokens.api.module.ModuleRegistry;

/**
 * Class that represents the Plugin
 */
public interface QPickaxes {

    /**
     * Listen to on disable
     */
    void whenDisabling(Runnable runnable);

    /**
     * Get tool module registry
     * @return ModuleRegistry
     */
    ModuleRegistry getModuleRegistry();

    /**
     * Get currency registry
     * @return currency registry
     */
    CurrencyRegistry getCurrencyRegistry();

}

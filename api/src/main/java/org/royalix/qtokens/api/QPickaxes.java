package org.royalix.qtokens.api;

import org.royalix.qtokens.api.currency.CurrencyRegistry;
import org.royalix.qtokens.api.module.ModuleRegistry;

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
     */
    ModuleRegistry getModuleRegistry();

    /**
     * Get currency registry
     */
    CurrencyRegistry getCurrencyRegistry();

}

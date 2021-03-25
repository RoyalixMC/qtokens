package org.royalix.qtokens.api.currency;

import org.royalix.qtokens.api.util.NumberWrapper;

import java.util.UUID;

public interface CurrencyProvider {

    /**
     * Get name of the provider
     * Used in configurations
     * @return name of the provider
     */
    String getName();

    /**
     * Get balance of an user
     * @param uuid uuid of the user
     * @return balance of the user wrapped with NumberWrapper
     */
    NumberWrapper getBalance(UUID uuid);

    /**
     * Withdraw amount from user
     * @param uuid the uuid of the user
     * @param amount amount to withdraw
     */
    void withdraw(UUID uuid, NumberWrapper amount);
}

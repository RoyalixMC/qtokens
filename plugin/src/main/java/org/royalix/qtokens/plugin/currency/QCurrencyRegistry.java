package org.royalix.qtokens.plugin.currency;

import com.oop.inteliframework.plugin.module.InteliModule;
import lombok.Getter;
import org.royalix.qtokens.api.currency.CurrencyProvider;
import org.royalix.qtokens.api.currency.CurrencyRegistry;

import java.util.TreeMap;

@Getter
public class QCurrencyRegistry implements CurrencyRegistry, InteliModule {

    private final TreeMap<String, CurrencyProvider> registeredCurrencies = new TreeMap<>(String::compareToIgnoreCase);

    @Override
    public void registerProvider(CurrencyProvider provider) {
        registeredCurrencies.put(provider.getName(), provider);
    }
}

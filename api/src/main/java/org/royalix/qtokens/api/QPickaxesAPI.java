package org.royalix.qtokens.api;

import com.google.common.base.Preconditions;

public class QPickaxesAPI {
    private static QPickaxes instance;

    public QPickaxesAPI(QPickaxes plugin) {
        Preconditions.checkArgument(instance == null, "QueenPickaxes instance is already registered, did the plugin successfully shutdown?!");
        instance = plugin;
    }

    public static QPickaxes getPlugin() {
        return instance;
    }
}

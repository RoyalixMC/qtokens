package org.royalix.qtokens.api.event;

import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.royalix.qtokens.api.QPickaxes;
import org.royalix.qtokens.api.QPickaxesAPI;

public class QPickaxesEnableEvent extends Event {
    private static final HandlerList handlerList = new HandlerList();

    public QPickaxes plugin() {
        return QPickaxesAPI.getPlugin();
    }

    @Override
    public HandlerList getHandlers() {
        return handlerList;
    }
}

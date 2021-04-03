package org.royalix.qtokens.plugin;

import com.oop.inteliframework.plugin.PlatformStarter;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import org.royalix.qtokens.api.event.QPickaxesEnableEvent;
import org.royalix.qtokens.plugin.config.ConfigurationController;
import org.royalix.qtokens.plugin.currency.QCurrencyRegistry;
import org.royalix.qtokens.plugin.inventory.QInventoryController;
import org.royalix.qtokens.plugin.module.QModuleRegistry;

import java.nio.file.Path;

public class QPickaxesPlugin extends JavaPlugin implements PlatformStarter {

    @Override
    public void onEnable() {
        startPlatform();
        registerModule(new ConfigurationController(), new QCurrencyRegistry(), new QModuleRegistry(), new QInventoryController());

        Bukkit.getPluginManager().callEvent(new QPickaxesEnableEvent());

    }

    @Override
    public Path dataDirectory() {
        return getDataFolder().toPath();
    }

    @Override
    public String name() {
        return "qPickaxes";
    }
}

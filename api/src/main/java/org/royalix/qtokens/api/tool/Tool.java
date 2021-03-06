package org.royalix.qtokens.api.tool;

import org.royalix.qtokens.api.hook.Hookable;
import org.royalix.qtokens.api.module.ToolModule;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.util.Optional;

/**
 * Class that manages the item representing this tool
 */
public interface Tool extends Hookable {

    /**
     * Get who is the holder of this tool
     */
    Optional<Player> getHolder();

    /**
     * Update the tool in player's inventory
     * @param force if the item should be updated forcefully
     */
    void update(boolean force);

    /**
     * Get module by type
     * @param moduleType the class of the T
     * @param <T> extends ToolModule
     */
    <T extends ToolModule> Optional<T> getModule(Class<T> moduleType);
}

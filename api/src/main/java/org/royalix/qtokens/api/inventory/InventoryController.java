package org.royalix.qtokens.api.inventory;

import org.bukkit.entity.Player;

/**
 * Manages players tool inventories
 */
public interface InventoryController {

    /**
     * Get tools inventory from player.
     * @param player from who
     * @return ToolsInventory from the player
     */
    ToolsInventory getInventory(Player player);

}

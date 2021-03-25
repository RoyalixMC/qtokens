package dev.royalix.qtokens.plugin.inventory;

import dev.royalix.qtokens.api.inventory.InventoryController;
import dev.royalix.qtokens.api.inventory.ToolsInventory;
import org.bukkit.entity.Player;

import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

public class QInventoryController implements InventoryController {
    private final Map<UUID, QToolsInventory> inventoryMap = new ConcurrentHashMap<>();

    @Override
    public ToolsInventory getInventory(Player player) {
        return inventoryMap.computeIfAbsent(
                player.getUniqueId(),
                key -> new QToolsInventory(player)
        );
    }
}

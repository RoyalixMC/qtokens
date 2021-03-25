package dev.royalix.qtokens.plugin.inventory;

import dev.royalix.qtokens.api.inventory.ToolsInventory;
import dev.royalix.qtokens.api.tool.Tool;
import lombok.Getter;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class QToolsInventory implements ToolsInventory {

    @Getter
    private final Player owner;
    private final Map<Integer, Tool> toolsMap = new ConcurrentHashMap<>();

    public QToolsInventory(Player owner) {
        this.owner = owner;
    }

    @Override
    public Set<Tool> getTools() {
        return new HashSet<>(toolsMap.values());
    }

    @Override
    public void initTools() {
        for (ItemStack content : owner.getInventory().getContents()) {
            if (content == null || content.getType() == Material.AIR) continue;
        }
    }
}

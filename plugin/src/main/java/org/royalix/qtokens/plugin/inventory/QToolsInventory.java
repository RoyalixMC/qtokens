package org.royalix.qtokens.plugin.inventory;

import de.tr7zw.changeme.nbtapi.NBTItem;
import lombok.NonNull;
import org.apache.commons.lang3.StringUtils;
import org.royalix.qtokens.api.inventory.ToolsInventory;
import org.royalix.qtokens.api.tool.Tool;
import lombok.Getter;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.royalix.qtokens.api.util.data.SerializedData;
import org.royalix.qtokens.plugin.inventory.handler.ToolDeserializer;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class QToolsInventory implements ToolsInventory {

    public static final String NBT_KEY = "QTOOL";

    @Getter
    private final Player owner;
    private final Map<Integer, Tool> toolsMap = new ConcurrentHashMap<>();

    public QToolsInventory(@NonNull Player owner) {
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

            NBTItem nbtItem = new NBTItem(content);
            if (!isTool(nbtItem))
                continue;

            // Init tool
            SerializedData data = ToolDeserializer.get().deserialize(nbtItem);
        }
    }

    public boolean isTool(NBTItem nbtItem) {
        return nbtItem.getKeys()
                .stream()
                .anyMatch(key -> StringUtils.contains(key, NBT_KEY));
    }

}

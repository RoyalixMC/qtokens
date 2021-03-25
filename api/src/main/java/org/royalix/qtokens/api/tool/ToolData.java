package org.royalix.qtokens.api.tool;

import org.royalix.qtokens.api.util.data.SerializableObject;
import org.bukkit.inventory.ItemStack;

import java.util.UUID;

/**
 * Class responsible for holding old tool data
 */
public interface ToolData extends SerializableObject {

    /**
     * Returns initial item that the tool was initialized with
     * This is stored to hold lore, display name, etc.
     */
    ItemStack getInitialItem();

    /**
     * returns initial owner of the tool uuid
     */
    UUID getInitialOwner();

}

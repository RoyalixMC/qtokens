package dev.royalix.qtokens.api.inventory;

import dev.royalix.qtokens.api.tool.Tool;

import java.util.Set;

/**
 * Class used for managing tools in inventory
 */
public interface ToolsInventory {

    /**
     * Get tools in the users inventory
     */
    Set<Tool> getTools();

    /**
     * Initialize tools inside inventory
     */
    void initTools();

}

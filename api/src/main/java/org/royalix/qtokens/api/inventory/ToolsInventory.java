package org.royalix.qtokens.api.inventory;

import org.royalix.qtokens.api.tool.Tool;

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

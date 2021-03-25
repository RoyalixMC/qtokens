package org.royalix.qtokens.plugin.config.main;

import com.oop.inteliframework.config.property.Configurable;
import com.oop.inteliframework.config.property.annotations.Comment;
import com.oop.inteliframework.config.property.annotations.Named;
import com.oop.inteliframework.config.property.property.PrimitiveProperty;
import com.oop.inteliframework.config.property.property.custom.ObjectProperty;

public class ToolsPart implements Configurable {
    @Named("max-tools")
    @Comment({
            "Max amount of tools in a single inventory that a player can have?",
            "If the player will receive another tool while he has reached the limit, it won't be picked up"
    })
    private final PrimitiveProperty.Mutable<Integer> maxTools = PrimitiveProperty.Mutable.fromInt(1);

    @Named("global-tools")
    @Comment({
            "Should the tools be global?",
            "If toggled, all players will be able to use that tools with the same enchants.",
            "If off, each player will have own enchants, stats, etc. on the same tool"
    })
    private final PrimitiveProperty.Mutable<Boolean> globalTools = PrimitiveProperty.Mutable.fromBoolean(false);

    @Named("droppable")
    @Comment({
            "Are players allowed to drop tools?"
    })
    private final PrimitiveProperty.Mutable<Boolean> droppable = PrimitiveProperty.Mutable.fromBoolean(false);

    @Named("display-order")
    @Comment({
            "Display order of modules in tools",
            "Separate each module by with a comma (,)"
    })
    private final ObjectProperty.Mutable<DisplayOrder> displayOrder = ObjectProperty.Mutable.from(DisplayOrder.ofString(
            "enchants, levels, stats"
    ));
}

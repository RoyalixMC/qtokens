package org.royalix.qtokens.plugin.module.level.config;

import com.oop.inteliframework.config.property.annotations.Comment;
import com.oop.inteliframework.config.property.annotations.Named;
import com.oop.inteliframework.config.property.property.CollectionProperty;
import com.oop.inteliframework.config.property.property.Property;
import com.oop.inteliframework.config.property.property.custom.ObjectProperty;
import org.royalix.qtokens.api.util.NumberWrapper;
import org.royalix.qtokens.plugin.util.math.MathExpression;

import java.util.LinkedList;

@Comment("Configuration of levels module for qPickaxes by Royalix.")
public class LevelModuleConfig {
    @Comment("Max amount of levels")
    @Named("max-level")
    private final Property<NumberWrapper> maxLevel = ObjectProperty.from(NumberWrapper.of(100));

    @Comment("Display of the level")
    @Named("display")
    private final CollectionProperty<String, LinkedList<String>> display = CollectionProperty.from(
            new LinkedList<>(), String.class,
            "&8&l-------------------",
            "&e&l* &7Level: &e%tool_level%",
            "&7 (( &e%blocks_till_next_level% blocks till next level &7))",
            "&7&l-------------------"
    );

    @Comment({
            "How much blocks to level up",
            "What ever the expression will return the result will be rounded"
    })
    @Named("blocks-to-level")
    private final ObjectProperty<MathExpression> blocksToLevel = ObjectProperty.from(
            MathExpression.of("100 * 10.5")
    );
}

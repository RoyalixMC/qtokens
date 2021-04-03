package org.royalix.qtokens.plugin.config.main;

import com.oop.inteliframework.config.property.annotations.Comment;
import com.oop.inteliframework.config.property.annotations.Named;
import com.oop.inteliframework.config.property.property.PrimitiveProperty;
import com.oop.inteliframework.config.property.property.Property;
import lombok.Getter;

@Comment({
        "This section sets how many threads overall this plugin uses",
        "Changes may impact performance so be careful!"
})
@Getter
public class ThreadsPart {
    @Named("pickaxe-monitor-threads")
    @Comment("Threads for monitoring pickaxes")
    private final Property<Long> pickaxeMonitorThreads = PrimitiveProperty
            .fromLong(1);

    @Named("misc-usage-threads")
    @Comment("Threads for misc usage")
    private final Property<Long> miscThreadsCount = PrimitiveProperty
            .fromLong(1);
}

package org.royalix.qtokens.plugin.config.main;

import com.oop.inteliframework.config.property.Configurable;
import com.oop.inteliframework.config.property.annotations.Comment;
import com.oop.inteliframework.config.property.annotations.Named;
import com.oop.inteliframework.config.property.property.custom.ObjectProperty;
import lombok.Getter;
import org.royalix.qtokens.plugin.config.main.tool.ToolsPart;

@Comment({"Main configuration for Queen Pickaxes by Royalix", "Speed, Quality, Kebabs all in one!"})
@Getter
public class MainConfig implements Configurable {

    @Named("tools")
    private final ObjectProperty<ToolsPart> toolsPart = ObjectProperty.from(new ToolsPart());

    @Named("threads")
    private final ObjectProperty<ThreadsPart> threadsPart = ObjectProperty.from(new ThreadsPart());

}

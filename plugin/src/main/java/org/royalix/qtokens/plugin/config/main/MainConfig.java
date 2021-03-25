package org.royalix.qtokens.plugin.config.main;

import com.oop.inteliframework.config.property.Configurable;
import com.oop.inteliframework.config.property.annotations.Comment;
import com.oop.inteliframework.config.property.annotations.Named;
import com.oop.inteliframework.config.property.property.custom.ObjectProperty;

@Comment({"Main configuration for Queen Pickaxes by Royalix", "Speed, Quality, Kebabs all in one!"})
public class MainConfig implements Configurable {

    @Named("tools-config")
    private final ObjectProperty<ToolsPart> toolsPart = ObjectProperty.from(new ToolsPart());

}

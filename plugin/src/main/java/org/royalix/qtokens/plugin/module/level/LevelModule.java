package org.royalix.qtokens.plugin.module.level;

import com.oop.inteliframework.plugin.module.InteliModule;
import lombok.Getter;
import org.royalix.qtokens.plugin.module.level.config.LevelModuleConfig;

@Getter
public class LevelModule implements InteliModule {

    private LevelModuleConfig config;

    public LevelModule() {

    }
}

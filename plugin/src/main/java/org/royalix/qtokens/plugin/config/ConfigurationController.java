package org.royalix.qtokens.plugin.config;

import com.oop.inteliframework.plugin.module.InteliModule;
import lombok.Getter;
import org.royalix.qtokens.plugin.config.main.MainConfig;

@Getter
public class ConfigurationController implements InteliModule {

    private MainConfig config;

}

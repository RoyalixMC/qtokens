package org.royalix.qtokens.plugin.module.level;

import lombok.NonNull;
import org.royalix.qtokens.api.module.ModuleProvider;
import org.royalix.qtokens.api.tool.Tool;
import org.royalix.qtokens.api.util.data.SerializedData;

public class LevelToolModuleProvider implements ModuleProvider<LevelToolModule> {
    @Override
    public LevelToolModule provide(Tool tool) {
        return null;
    }

    @Override
    public LevelToolModule deserialize(SerializedData data) {
        return null;
    }

    @Override
    public void serialize(LevelToolModule module, SerializedData data) {

    }

    @Override
    public void doInit(LevelToolModule module) {

    }

    @Override
    public @NonNull String getName() {
        return "royalix-level";
    }
}

package org.royalix.qtokens.plugin.tool;

import lombok.Getter;
import lombok.NonNull;
import org.bukkit.entity.Player;
import org.royalix.qtokens.api.hook.HookPriority;
import org.royalix.qtokens.api.hook.Hooked;
import org.royalix.qtokens.api.hook.ToolHook;
import org.royalix.qtokens.api.module.ToolModule;
import org.royalix.qtokens.api.tool.Tool;

import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;

@Getter
public class QTool implements Tool, ToolModuleHolder {

    private final Map<String, ToolModule> modules = new TreeMap<>(String::compareToIgnoreCase);
    private Player currentHolder;

    @Override
    public <T extends ToolHook> Hooked hook(@NonNull Class<T> hookClazz, @NonNull HookPriority priority) {
        //TODO: Implement
        return null;
    }

    @Override
    public Optional<Player> getHolder() {
        return Optional.ofNullable(currentHolder);
    }

    @Override
    public void update(boolean force) {

    }

    @Override
    public <T extends ToolModule> Optional<T> getModule(Class<T> moduleType) {
        return modules.values().stream()
                .filter(module -> module.getClass() == moduleType)
                .map(module -> (T) module)
                .findFirst();
    }
}

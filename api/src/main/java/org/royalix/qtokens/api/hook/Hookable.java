package org.royalix.qtokens.api.hook;

import lombok.NonNull;

public interface Hookable {

    /**
     * Hook
     * @param hookClazz class of the hook
     * @param priority priority you want your hook to run at
     * @param <T> the hook type
     */
    <T extends ToolHook> Hooked hook(@NonNull Class<T> hookClazz, @NonNull HookPriority priority);

}

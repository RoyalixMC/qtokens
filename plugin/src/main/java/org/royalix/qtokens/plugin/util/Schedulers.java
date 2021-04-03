package org.royalix.qtokens.plugin.util;

import com.oop.inteliframework.plugin.InteliPlatform;
import com.oop.inteliframework.task.InteliTaskFactory;
import com.oop.inteliframework.task.bukkit.BukkitTaskController;
import com.oop.inteliframework.task.type.inteli.InteliTaskController;

public class Schedulers {
    public static final InteliTaskController MISC = InteliPlatform
            .getInstance()
            .safeModuleByClass(InteliTaskFactory.class)
            .controllerByClass(MISC_SCHEDULER.class)
            .get();

    public static final BukkitTaskController BUKKIT = InteliPlatform
            .getInstance()
            .safeModuleByClass(InteliTaskFactory.class)
            .controllerByClass(BukkitTaskController.class)
            .get();

    public static final InteliTaskController PICKAXE_TRACK = InteliPlatform
            .getInstance()
            .safeModuleByClass(InteliTaskFactory.class)
            .controllerByClass(PICKAXE_TRACK_SCHEDULER.class)
            .get();

    private static class MISC_SCHEDULER extends InteliTaskController {
        public MISC_SCHEDULER(int threadsCount) {
            super(threadsCount);
        }
    }

    private static class PICKAXE_TRACK_SCHEDULER extends InteliTaskController {
        public PICKAXE_TRACK_SCHEDULER(int threadsCount) {
            super(threadsCount);
        }
    }
}

package org.royalix.qtokens.plugin.tool;

import com.eatthepath.uuid.FastUUID;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.bukkit.inventory.ItemStack;
import org.royalix.qtokens.api.tool.ToolData;
import org.royalix.qtokens.api.util.data.SerializedData;

import java.util.UUID;

@Getter
@AllArgsConstructor
public class QToolData implements ToolData {

    private UUID initialOwner;
    private ItemStack initialItem;

    @Override
    public void serialize(SerializedData data) {
        data.write("iOwner", FastUUID.toString(initialOwner));
        // TODO: Write ItemStack
    }

    @Override
    public void deserialize(SerializedData data) {
        this.initialOwner = FastUUID.parseUUID(data.applyAs("iOwner", String.class));
    }
}

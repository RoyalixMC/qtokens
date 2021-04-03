package org.royalix.qtokens.plugin.inventory.handler;

import com.oop.inteliframework.commons.util.InteliPair;
import com.oop.inteliframework.plugin.module.InteliModule;
import de.tr7zw.changeme.nbtapi.NBTItem;
import org.royalix.qtokens.api.util.data.SerializedData;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.royalix.qtokens.plugin.inventory.QToolsInventory.NBT_KEY;


public class ToolDeserializer implements InteliModule {

    private static final ToolDeserializer INSTANCE = new ToolDeserializer();
    private final Pattern BACKPACK_DATA_PATTERN = Pattern.compile(NBT_KEY + "_([0-9]+)");

    public static ToolDeserializer get() {
        return INSTANCE;
    }

    public SerializedData deserialize(NBTItem nbtItem) {
        return new SerializedData();
    }

    private String uncoverData(NBTItem nbtItem) {
        List<InteliPair<Integer, String>> uncoveredData = new ArrayList<>();

        // Extracting data
        for (String key : nbtItem.getKeys()) {
            Matcher matcher = BACKPACK_DATA_PATTERN.matcher(key);
            if (matcher.find()) {
                uncoveredData.add(new InteliPair<>(Integer.parseInt(matcher.group(1)), nbtItem.getString(key)));
            }
        }

        if (uncoveredData.isEmpty())
            return nbtItem.getString(NBT_KEY);

        // Sorting by the num
        uncoveredData.sort(Comparator.comparingInt(InteliPair::getKey));
        String string = "";
        for (InteliPair<Integer, String> uncoveredDatum : uncoveredData)
            string += uncoveredDatum.getValue();

        return string;
    }
}

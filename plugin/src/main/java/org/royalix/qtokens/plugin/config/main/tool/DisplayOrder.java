package org.royalix.qtokens.plugin.config.main.tool;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.apache.commons.lang3.StringUtils;

import java.util.Map;
import java.util.TreeMap;

@AllArgsConstructor (access = AccessLevel.PRIVATE)
@Getter
public class DisplayOrder {

    private final Map<String, Integer> moduleToOrder;

    public static DisplayOrder ofString(String value) {
        // Remove all spaces
        value = StringUtils.replace(value, " ", "");

        // Split at commas
        String[] split = StringUtils.split(value, ",");

        Map<String, Integer> orderMap = new TreeMap<>(String::compareToIgnoreCase);

        int order = 0;
        for (String moduleName : split) {
            orderMap.put(moduleName, order);
            order++;
        }

        return new DisplayOrder(orderMap);
    }
}

package ch.hatbe.juventus.collections;

import java.util.*;

public class MapFilter {
    public  <K, V> Map<K, V> cleanup(Map<K, V> input, V value) {
        if(input == null || input.isEmpty()) {
            return Collections.emptyMap();
        }

        Map<K, V> output = new HashMap<>(input);

        output.entrySet().removeIf(entry -> !entry.getValue().equals(value));
        return output;
    }
}

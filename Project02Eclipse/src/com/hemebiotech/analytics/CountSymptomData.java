package com.hemebiotech.analytics;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountSymptomData {

    public List<String> counting (ISymptomReader iSymptomReader) {

        Map<String, Long> count = new HashMap<>();
        for (String line : iSymptomReader.getSymptoms()) {


            if (count.containsKey(line)) {
                count.put(line, count.get(line) + 1);
            } else {
                count.put(line, 1L);
            }
        }

        List<String> sort = count.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .map(entry -> entry.getKey() + " = " + entry.getValue())
                .collect(Collectors.toList());

        return count;
    }

}
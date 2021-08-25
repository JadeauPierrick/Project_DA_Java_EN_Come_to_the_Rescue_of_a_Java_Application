package com.hemebiotech.analytics;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CountSymptomData {

    public Map<String, Long> counting (ReadSymptomDataFromFile readSymptomDataFromFile) {

        Map<String, Long> count = new HashMap<>();
        for (String line : readSymptomDataFromFile.getSymptoms()) {


            if (count.containsKey(line)) {
                count.put(line, count.get(line) + 1);
            } else {
                count.put(line, 1L);
            }
        }
        return count;
    }

}
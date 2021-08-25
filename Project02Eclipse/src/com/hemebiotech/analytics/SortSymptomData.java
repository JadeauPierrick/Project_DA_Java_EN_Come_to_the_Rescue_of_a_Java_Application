package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SortSymptomData {

    public List<String> sorting (CountSymptomData countSymptomData) {

        List<String> sort = countSymptomData.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .map(entry -> entry.getKey() + " = " + entry.getValue())
                .collect(Collectors.toList());
    }
}

package com.hemebiotech.analytics;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;



public class CountSymptomData {

    public ISymptomReader iSymptomReader;

    public CountSymptomData(ISymptomReader iSymptomReader) {
        this.iSymptomReader = iSymptomReader;
    }

    /**
     * Starting the counting process with the new HashMap
     * Then sorting the result with the sort List
     *
     * @return Alphabetically sorted list
     */

    public List<String> countList(){


        Map<String, Long> count = new HashMap<>();
        for (String line : this.iSymptomReader.getSymptoms()) {


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

        return sort;
    }

}
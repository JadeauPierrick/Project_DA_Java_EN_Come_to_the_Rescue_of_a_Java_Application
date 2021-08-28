package com.hemebiotech.analytics;

import java.io.IOException;


public class AnalyticsCounter {

	public static void main(String[] args) throws IOException {

		ISymptomReader newRead = new ReadSymptomDataFromFile("symptoms.txt");
		CountSymptomData newCount = new CountSymptomData(newRead);
		DataWriterOnFile newData = new DataWriterOnFile("result.out");
		newData.write(newCount.count());

	}
}


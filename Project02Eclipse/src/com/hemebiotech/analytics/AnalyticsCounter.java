package com.hemebiotech.analytics;

import java.io.IOException;


public class AnalyticsCounter {

	public static void main(String[] args) throws IOException {

		ISymptomReader newRead = new ReadSymptomDataFromFile("Project02Eclipse/symptoms.txt");
		CountSymptomData newCount = new CountSymptomData(newRead);
		DataWriterOnFile newData = new DataWriterOnFile("result.out");
		newData.write(newCount.countList());

		FileProperties newProperties = new FileProperties("result.out");
		newProperties.displayProperties("fever");
	}
}


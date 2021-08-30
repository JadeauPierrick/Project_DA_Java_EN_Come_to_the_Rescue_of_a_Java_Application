package com.hemebiotech.analytics;

import java.io.IOException;


public class AnalyticsCounter {

	public static void main(String[] args) throws IOException {

		ISymptomReader newRead = new ReadSymptomDataFromFile("/Users/jacquesgrellier/Desktop/Formation Développeur JAVA/deuxieme_projet/Project02Eclipse/symptoms.txt");
		CountSymptomData newCount = new CountSymptomData(newRead);
		DataWriterOnFile newData = new DataWriterOnFile("/Users/jacquesgrellier/Desktop/Formation Développeur JAVA/deuxieme_projet/result.out");
		newData.write(newCount.count());

	}
}


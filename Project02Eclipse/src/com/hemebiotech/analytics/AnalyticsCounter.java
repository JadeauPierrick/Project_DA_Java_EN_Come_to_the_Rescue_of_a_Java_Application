package com.hemebiotech.analytics;

import java.io.IOException;

/**
 * This function is the entry point of our program
 *
 */

public class AnalyticsCounter {

	public static void main(String[] args) throws IOException {

		FileProperties newFileIn = new FileProperties();
		ISymptomReader newRead = new ReadSymptomDataFromFile(newFileIn.displayProperties("entrance"));
		CountSymptomData newCount = new CountSymptomData(newRead);
		FileProperties newFileOut = new FileProperties();
		DataWriterOnFile newData = new DataWriterOnFile(newFileOut.displayProperties("exit"));
		newData.write(newCount.countList());

	}
}

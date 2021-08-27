package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class AnalyticsCounter {

	public static void main(String[] args) throws IOException {

		ISymptomReader newRead = new ReadSymptomDataFromFile("/Users/jacquesgrellier/Desktop/Formation Développeur JAVA/deuxieme_projet/Project02Eclipse/symptoms.txt");
		CountSymptomData newCount = new CountSymptomData(newRead);
		DataWriterOnFile newData = new DataWriterOnFile("result.out");
		newData.write(newCount.count());

	}


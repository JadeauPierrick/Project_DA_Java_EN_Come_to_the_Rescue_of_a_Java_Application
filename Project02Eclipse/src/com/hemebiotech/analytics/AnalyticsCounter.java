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


	public static void main(String args[]) throws Exception {

		try {
			// Etape 1 : Lire le fichier symptoms.txt (et mise en mémoire dans une liste
			List<String> lines = Files.readAllLines(Paths.get("/Users/jacquesgrellier/Desktop/Formation Développeur JAVA/deuxieme_projet/Project02Eclipse/symptoms.txt"));

			// Etape 2 : Parcourir le fichier en comptant les symptômes avec la map (HasMap ou TreeMap)
			Map<String, Long> count = new HashMap<>();
			for (String line : lines) {

				if (count.containsKey(line)) {
					count.put(line, count.get(line) + 1);
				} else {
					count.put(line, 1L);
				}
			}
			// Etape 3 : Ranger dans l'ordre alphabétique les symptômes
			List<String> sort = count.entrySet()
					.stream()
					.sorted(Map.Entry.comparingByKey())
					.map(entry -> entry.getKey() + " = " + entry.getValue())
					.collect(Collectors.toList());

			// Etape 4 : Ecrire le résultat dans le fichier "result.out"
			Files.write(Paths.get("result.out"), sort);

		}

		catch (IOException e) {
			e.printStackTrace();
		}
	}
}

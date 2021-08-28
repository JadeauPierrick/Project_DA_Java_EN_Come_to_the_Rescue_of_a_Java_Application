package com.hemebiotech.analytics;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class DataWriterOnFile {

    private String fileway;
    private Path path;
    private String content;

    public DataWriterOnFile(String fileway) {
        this.fileway = fileway;
    }

    public void write(List<String> data) {

        try {

            path = Paths.get(fileway);
            content = "";
            Files.write(path, String.format(content).getBytes());

        } catch (IOException e) {
            e.printStackTrace();


        }

    }

}
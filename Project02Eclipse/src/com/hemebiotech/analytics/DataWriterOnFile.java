package com.hemebiotech.analytics;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class DataWriterOnFile {

    /**
     * Write the countList method's result into a new file
     */

    private String fileway;

    /**
     * @fileway is the new file
     */

    private Path path;

    public DataWriterOnFile(String fileway) {
        this.fileway = fileway;
    }

    public void write(List<String> data) {

        try {

            path = Paths.get(fileway);
            Files.write(path, data);

        } catch (IOException e) {
            e.printStackTrace();


        }

    }

}
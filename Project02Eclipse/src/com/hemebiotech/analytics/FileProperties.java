package com.hemebiotech.analytics;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileProperties {

    private String file;

    public FileProperties(String file) {
        this.file = file;
    }

    public void displayProperties(String key) {

        try {

            Properties prop = new Properties();
            prop.load(new FileInputStream(file));

            System.out.println(prop.getProperty(key));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
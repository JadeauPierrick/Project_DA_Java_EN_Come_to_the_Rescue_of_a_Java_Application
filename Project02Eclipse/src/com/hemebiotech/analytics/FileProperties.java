package com.hemebiotech.analytics;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileProperties {

    private final String file = "Project02Eclipse/src/application.properties";

    private String value;

    public String displayProperties(String key) {


        if (file != null)

        try {

            Properties prop = new Properties();
            prop.load(new FileInputStream(file));

            value = prop.getProperty(key);


        } catch (IOException e) {
            e.printStackTrace();
        }

    return value;
    }
}
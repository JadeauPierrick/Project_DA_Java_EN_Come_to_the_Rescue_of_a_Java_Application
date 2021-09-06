package com.hemebiotech.analytics;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileProperties {

    /**
     * The input and output files are called in this class
     * They are contained in the properties file
     */

    private final String file = "Project02Eclipse/src/application.properties";

    private String value;

    public String displayProperties(String key) {

        /**
         * @param load the properties file and ask the value of the corresponding key
         */

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
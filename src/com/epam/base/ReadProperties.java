package com.epam.base;

import com.epam.enums.Property;

import java.util.ResourceBundle;

public class ReadProperties {
    private static ResourceBundle resourceBundle = ResourceBundle.getBundle("config");

    public static String getProperty(Property property) {
        return resourceBundle.getString(property.getValue());
    }
}

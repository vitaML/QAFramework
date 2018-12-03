package com.epam.enums;

public enum Property {
    BASEURL("baseurl"),
    BROWSER("browser");

    private String value;

    Property(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}

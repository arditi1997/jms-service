package com.jms.service.model;

public enum ResponseEnum {
    SUCCESSFULLY("Product is sent successfully!");

    private String value;

    ResponseEnum(String value) {
        this.value =  value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}

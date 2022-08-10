package com.jms.model;

public enum JmsType {
    QUEUE("QUEUE"),TOPIC("TOPIC");

    public final String name;

    private JmsType(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

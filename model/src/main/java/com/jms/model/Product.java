package com.jms.model;

import org.hibernate.validator.constraints.Length;
import org.jetbrains.annotations.NotNull;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.io.Serializable;

public class Product implements Serializable {

    private String id;
    @NotEmpty(message = "Name must not be empty!")
    private String name;
    @NotEmpty(message = "Price must not be empty!")
    private String price;
    @NotEmpty(message = "Quantity must not be empty!")
    private String quantity;
    @NotEmpty(message = "Type must not be empty!")
    private String type;
    private String jmsType;

    public Product(String name, String price, String quantity, String type, String jmsType, String id) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.type = type;
        this.jmsType = jmsType;
    }

    public Product() {

    }

    public String getJmsType() {
        return jmsType;
    }

    public void setJmsType(String jmsType) {
        this.jmsType = jmsType;
    }

    public String getId() {
        return id;
    }

    public void setId(String  id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

package org.learning;

import java.util.Random;

public class Product {
    private int code;
    private String name;
    private String description;
    private double price;
    private double vat;

    Random rnd = new Random();

    public Product(){
        this.code = rnd.nextInt((999999 - 1 + 1) + 1);
        this.vat = 22;
    }

    public String getCode() {
        return  String.format("%06d", code);
    }

    public double getFinalPrice() {
        return price + (price * 22 / 100);
    }

    public String getFullName() {
        return getCode() + name;
    }

    public double getVat() {
        return vat;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

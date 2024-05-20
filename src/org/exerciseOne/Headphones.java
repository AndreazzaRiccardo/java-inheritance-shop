package org.exerciseOne;

import java.math.BigDecimal;

public class Headphones extends Product{

    public enum Type {wireless, cable};

    private String color;
    private Type type;

    public Headphones(String name,BigDecimal price, String color, Type type) {
        super(name, price);
        this.color = color;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Headphone {" +
                "name = '" + getName() + '\'' +
                ", color = '" + color + '\'' +
                ", type = " + type +
                ", price = " + price +
                '}';
    }

    public void fidelity() {
        if(type == Type.cable){
            price =  price.multiply(BigDecimal.valueOf(0.93));
        } else {
            fidelityPrice();
        }
    }
}

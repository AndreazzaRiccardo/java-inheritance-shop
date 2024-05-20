package org.exerciseOne;

import java.math.BigDecimal;

public class Headphones extends Product{

    public enum Type {WIRELESS, CABLE};

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

    public BigDecimal fidelity(BigDecimal price) {
        if(type == Type.CABLE){
            return   price.multiply(BigDecimal.valueOf(0.93));
        } else {
            return   super.fidelity(price);
        }
    }
}

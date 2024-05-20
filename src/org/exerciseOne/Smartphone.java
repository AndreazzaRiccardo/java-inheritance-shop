package org.exerciseOne;

import java.math.BigDecimal;
import java.util.Random;

public class Smartphone extends Product{
    private String imeiCode;
    private int memory;

    Random rnd = new Random();

    public Smartphone(String name,BigDecimal price, int memory) {

        super(name, price);

        imeiCode = String.format("%07d", rnd.nextInt(1_000_000) + 1);
        if (memory != 128 || memory != 256 || memory != 512 || memory != 1024) {
            this.memory = 128;
        }
    }

    @Override
    public String toString() {
        return "Smartphone {" +
                "name = '" + getName() + '\'' +
                ", imeiCode = '" + imeiCode + '\'' +
                ", memory = " + memory +
                ", price = " + price +
                '}';
    }

    public BigDecimal fidelity(BigDecimal price) {
        if(memory < 256){
            return   price.multiply(BigDecimal.valueOf(0.95));
        } else {
            return super.fidelity(price);
        }
    }
}

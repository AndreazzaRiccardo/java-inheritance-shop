package org.exerciseOne;

import java.math.BigDecimal;

public class Tv extends Product{

    public boolean isSmart;
    private int size;

    public Tv(String name,BigDecimal price, boolean isSmart, int size) {
        super(name, price);
        this.isSmart = isSmart;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Tv {" +
                "name = '" + getName() + '\'' +
                ", is smart ? = '" + isSmart + '\'' +
                ", size = " + size +
                ", price = " + price +
                '}';
    }

    public BigDecimal fidelity(BigDecimal price) {
        if(!isSmart){
            return   price.multiply(BigDecimal.valueOf(0.90));
        } else {
            return   super.fidelity(price);
        }
    }
}

package org.exerciseOne;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        Product p1 = new Product();

        p1.setName("cappotto");
        p1.setPrice(24);

        System.out.println(p1.getCode());
        System.out.println(p1.getFullName());
        System.out.println(p1.getFinalPrice());
    }
}

package org.exerciseOne;

import java.math.BigDecimal;
import java.util.Random;

public class Product {
    private int code;
    private String name;
    private String description;
    private BigDecimal price;
    private final BigDecimal vat;

    private static final Random rnd = new Random();

    public Product() {
        this.code = rnd.nextInt(999999) + 1; // Random code between 1 and 999999
        this.vat = BigDecimal.valueOf(22); // VAT as BigDecimal
    }

    public String getCode() {
        return String.format("%06d", code);
    }

    public BigDecimal getFinalPrice() {
        BigDecimal vatAmount = price.multiply(vat.divide(BigDecimal.valueOf(100)));
        return price.add(vatAmount);
    }

    public String getFullName() {
        return getCode() + name;
    }

    public BigDecimal getVat() {
        return vat;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = new BigDecimal(price);
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

package org.exerciseOne;

import java.math.BigDecimal;
import java.util.Random;

public class Product {
    private final int code;
    protected String name;
    protected String description;
    protected BigDecimal price;
    protected final BigDecimal vat;

    private static final Random rnd = new Random();

    public Product(String name, BigDecimal price) {
        this.code = rnd.nextInt(999999) + 1;
        this.vat = BigDecimal.valueOf(22);
        this.name = name;
        this.price = price;
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

    public void fidelityPrice() {
        price = price.multiply(BigDecimal.valueOf(0.98));
    }
}

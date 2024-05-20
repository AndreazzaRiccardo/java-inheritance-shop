package org.exerciseOne;

import java.math.BigDecimal;
import java.util.Scanner;

public class Cart {

    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);

        int cartLength = 0;

        while (true) {
            System.out.print("How many products do you want to buy (1-5)? ");

            cartLength = Integer.parseInt(scann.nextLine());
            if (cartLength >= 1 && cartLength <= 5) {
                break;
            } else {
                System.out.println("Please enter a number between 1 and 5.");
            }
        }

        System.out.print("Do you have a loyalty card ? ");
        boolean fidelity = Boolean.parseBoolean(scann.nextLine());

        Product[] cart = new Product[cartLength];

        for (int i = 0; i < cart.length; i++) {
            System.out.print("What type of product are you purchasing ? (smartphone / tv / headphones) : ");
            String prod = scann.nextLine();
            System.out.print("Insert product name: ");
            String productName = scann.nextLine();
            System.out.print("Set price : ");
            BigDecimal price = new BigDecimal(scann.nextLine());

            switch (prod) {
                case "smartphone":
                    System.out.print("Chose memory (128 / 256 / 512) : ");
                    int memoryPhone = Integer.parseInt(scann.nextLine());
                    cart[i] = new Smartphone(productName, price, memoryPhone);
                    if (fidelity){
                        Smartphone phone = (Smartphone) cart[i];
                        phone.price = phone.fidelity(price);
                    }
                    break;
                case "tv":
                    System.out.print("Do you want smart tv ? : ");
                    boolean isSmart = Boolean.parseBoolean(scann.nextLine());
                    System.out.print("Chose size : ");
                    int size = Integer.parseInt(scann.nextLine());
                    cart[i] = new Tv(productName, price, isSmart, size);
                    if (fidelity){
                        Tv tv = (Tv) cart[i];
                        tv.price = tv.fidelity(price);
                    }
                    break;
                case "headphones":
                    System.out.print("Chose color : ");
                    String color = scann.nextLine();
                    System.out.print("Chose type : ");
                    String type = scann.nextLine().toUpperCase();
                    cart[i] = new Headphones(productName, price, color, Headphones.Type.valueOf(type));
                    if (fidelity){
                        Headphones headphones = (Headphones) cart[i];
                        headphones.price = headphones.fidelity(price);
                    }
                    break;
                default:
                    System.out.println("Insert correct value");
                    i--;
            }
        }

        System.out.println("********************************************************************************");

        BigDecimal totalPrice = BigDecimal.ZERO;
        for (Product product : cart) {
            System.out.println(product.toString());
            totalPrice = totalPrice.add(product.price);
        }

        System.out.println("Total price = " + totalPrice);
    }
}

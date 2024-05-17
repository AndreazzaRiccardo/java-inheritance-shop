package org.exerciseTwo;

import java.math.BigDecimal;
import java.util.Scanner;

public class Bank {

    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);

        System.out.print("Enter your name for open a new bill: ");
        String ownerName = scann.nextLine();

        if(ownerName.length() > 0) {
            Bill b1 = new Bill(ownerName);
            for (int i = 0; i < 30; ++i) System.out.println();
            System.out.println("Owner Name: " + b1.getOwner());
            System.out.println("Account Number assigned: " + b1.getBillNumber());

            while(true) {
                String separator = "*******************************************************************";
                System.out.print("Chose operation: (a: add balance)-(d: take from the bill)-(e: exit): ");
                String input = scann.nextLine();

                switch (input) {
                    case "e" : return;
                    case "a" :
                        System.out.print("How much do you want to deposit ?: ");
                        b1.addBalance(new BigDecimal(scann.nextLine()));
                        System.out.println("Your balance amount is: " + b1.getBalance() + " €");
                        System.out.println(separator);
                        break;
                    case "d":
                        System.out.print("How much do you want to take ?: ");
                        Boolean taking = b1.dedBalance(new BigDecimal(scann.nextLine()));
                        if(taking){
                            System.out.println("Your balance amount is: " + b1.getBalance() + " €");
                        } else {
                            System.out.println("Your balance is insufficient");
                        }
                        System.out.println(separator);
                        break;
                }
            }

        }

    }
}

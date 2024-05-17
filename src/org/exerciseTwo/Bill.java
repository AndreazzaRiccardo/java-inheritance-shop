package org.exerciseTwo;

import java.math.BigDecimal;
import java.security.SecureRandom;

public class Bill {

    private String billNumber;
    private String owner;
    private BigDecimal balance;

    public Bill(String owner){
        this.owner = owner;
        this.billNumber = generateRandomAccountCode();
        this.balance = BigDecimal.ZERO;
    }

    private static String generateRandomAccountCode() {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        int billLength = 20;
        SecureRandom random = new SecureRandom();
        StringBuilder sb = new StringBuilder(billLength);

        for (int i = 0; i < billLength; i++) {
            int index = random.nextInt(characters.length());
            sb.append(characters.charAt(index));
        }
        return sb.toString();
    }

    public void addBalance(BigDecimal add) {
        balance = balance.add(add);
    }

    public boolean dedBalance(BigDecimal ded) {
        if(balance.compareTo(ded) >= 0){
            balance = balance.subtract(ded);
            return true;
        }
        return false;
    }

    public String getBillNumber(){
        return this.billNumber;
    }

    public String getOwner() {
        return this.owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public BigDecimal getBalance() {
        return this.balance;
    }
}

package com.bankaccount;
import java.util.Random;

public class BankAccount{
	
	
    private String accountNumber; 
    
    private double checkingBalance; 
    private double savingsBalance; 
    private static double totalAmountInAccount;


public BankAccount(){
    generateNewAccountNumber();
}

public String getAccount(){
    return accountNumber;
    
}

private String generateNewAccountNumber(){
	
    String numbers = "0123456789";
    String newAccountNumber = "";

    Random rand = new Random();

    for (int i = 0; i < 5; i++){
    	
        int num = numbers.charAt(rand.nextInt(10));
        
        newAccountNumber += num; 
    }
    
    
    accountNumber = newAccountNumber; 

    return newAccountNumber;
}

public void setCheckingBalance(double checkingBalance){
	
    this.checkingBalance = checkingBalance;
}

public double getChecking(){
    System.out.println("Account balance: $" + this.checkingBalance);
    
    return this.checkingBalance;
}

public void withdrawalCheck(int amount){
    if (getChecking() < Double.valueOf(amount)){
        System.out.println("Not enough money in this account (You're broke!)");
    } 
    else{
        setCheckingBalance(getChecking() - Double.valueOf(amount));

    }
}


public void setSavingsBalance(double savingsBalance){
    this.savingsBalance = savingsBalance;
    
}


public double getSavings(){
    System.out.println("Savings balance: $" + this.savingsBalance);
    
    return this.savingsBalance;

}

public void depositCheck(double checkingBalance){
    this.setCheckingBalance(checkingBalance);
    
    totalAmountInAccount += checkingBalance;
    
}

public void depositSavings(double savingsBalance){
    this.setSavingsBalance(savingsBalance);
    
    totalAmountInAccount += savingsBalance;
}


public void withdrawalSavings(int amount){
    if (getSavings() < Double.valueOf(amount)){
    	
    	
        System.out.println("Not enough money in this account (You're broke!)");
    } 
    else{
    	
        this.setSavingsBalance(this.getSavings() - Double.valueOf(amount));
    }

}
public double total(){
	
    totalAmountInAccount = savingsBalance + checkingBalance;
    return totalAmountInAccount;
    
}

}
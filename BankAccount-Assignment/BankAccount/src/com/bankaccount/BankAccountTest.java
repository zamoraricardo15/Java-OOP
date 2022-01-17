package com.bankaccount;

public class BankAccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        BankAccount account1 = new BankAccount();
        
        System.out.println("Bank account number: " + account1.getAccount());
        account1.getChecking();
        account1.getSavings();
        account1.depositCheck(1270);
        account1.depositSavings(275);
        account1.withdrawalCheck(65);
        account1.withdrawalSavings(195);
        account1.total();
        System.out.println("Total: $" + account1.total());
	}

}

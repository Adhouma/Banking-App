package com.banking;

/**
 * In this project, you will be learning how to take input from the user using Scanner class,
 * basics about String, how to print in java, variables, if/else statements, methods, loops, etc.
 * In simple banking application you will be coding the simple bank operations like 
 * - Check balance
 * - Deposit
 * - Withdraw
 * - Exit 
 */
public class BankingApp {

	public static void main(String[] args) {
		BankAccount myAccount = new BankAccount("Abdeladhim Abbassi", "0012345");
		myAccount.showMenu();
	}

}

package com.banking;

import java.util.Scanner;

public class BankAccount {

	// Fields
	private double balance;
	private double previousTransaction;
	private String customerName;
	private String customerId;

	// Constructor
	public BankAccount(String customerName, String customerId) {
		this.customerName = customerName;
		this.customerId = customerId;
	}

	// Getters
	private double getBalance() {
		return balance;
	}

	private String getCustomerName() {
		return customerName;
	}

	private String getCustomerId() {
		return customerId;
	}

	private void getPreviousTransaction() {
		if (previousTransaction > 0) {
			System.out.println("Deposited: " + previousTransaction);
		} else if (previousTransaction < 0) {
			System.out.println("Withdrawn: " + Math.abs(previousTransaction));
		} else {
			System.out.println("No transaction occured");
		}
	}

	// Methods
	private void deposit(int amount) {
		if (amount != 0) {
			balance = balance + amount;
			previousTransaction = amount;
		}
	}

	private void withdraw(int amount) {
		if (amount != 0) {
			balance = balance - amount;
			previousTransaction = -amount;
		}
	}

	public void showMenu() {
		char option = '\0';

		Scanner scanner = new Scanner(System.in);

		System.out.println("/*--- Banking App ---*/");
		System.out.println("====================");
		System.out.println("Welcome " + getCustomerName());
		System.out.println("Your ID: " + getCustomerId() + "\n");
		System.out.println("====================");

		System.out.println("A. Check balance");
		System.out.println("B. Deposit");
		System.out.println("C. Withdraw");
		System.out.println("D. Previous transaction");
		System.out.println("E. Exit");

		do {
			System.out.println("====================");
			System.out.println("Enter an option:");
			option = scanner.next().toUpperCase().charAt(0);

			switch (option) {
				case 'A':
					System.out.println("====================");
					System.out.println("Balance = " + String.format("%.2f", getBalance()) + "$");
					break;
				case 'B':
					System.out.println("====================");
					System.out.println("Enter an amount to deposit:");
					int amountToDeposit = scanner.nextInt();
					deposit(amountToDeposit);
					break;
				case 'C':
					System.out.println("====================");
					System.out.println("Enter an amount to withdraw:");
					int amountToWithdraw =  scanner.nextInt();
					withdraw(amountToWithdraw);
					break;
				case 'D':
					System.out.println("====================");
					getPreviousTransaction();
					break;
				case 'E':
					System.out.println("====================");
					System.out.println("Thank you for using our services.");
					break;
					
				default:
					System.out.println("Invalid option!, Please try again.");
					break;
			}

		} while (option != 'E');
		
		scanner.close();
	}

}

package BankApp;

import java.util.Scanner;

public class BankAccount
{
	int balance;
	int previousTransaction;
	String name;
	String id;
	
	public BankAccount(String name, String id) {
		super();
		this.name = name;
		this.id = id;
	}
	
	void deposit(int amount) {
		
		if (amount != 0) {
			balance = amount + balance;
			previousTransaction = amount;
		}

	}
	
	void withdraw(int amount) {
		
		if (amount != 0) {
			balance = balance - amount;
			previousTransaction = -amount;
		}
		
	}

	public void getPreviousTransaction() {
		
		if (previousTransaction > 0) {
			System.out.println("Deposited: " + previousTransaction);
		}
		else if (previousTransaction < 0) {
			System.out.println("Withdraw: " + previousTransaction);
		}
		else {
			System.out.println("No Transaction Occured");
		}
		
	}

	
	void showMenu() {
		char option = '\0';
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Welcome: " + name);
		System.out.println("Your ID is: " + id);
		System.out.println("A. Withdraw");
		System.out.println("B. Deposit");
		System.out.println("C. Check Balance");
		System.out.println("D. EXIT");
		
		do {
			
			System.out.println("Please enter an option: ");
			option = scan.next().charAt(0);
			System.out.println("\n");
			
			switch(option) {
			
			case 'A':
				System.out.println("How much would you like to withdraw: ");
				int amount = scan.nextInt();
				withdraw(amount);
				System.out.println("\n");
				break;
				
			case 'B':
				System.out.println("How much would you like to deposit: ");
				int amount2 = scan.nextInt();
				deposit(amount2);
				System.out.println("\n");
				break;
			
			case 'C':
				System.out.println("Your Balance: " + balance);
				break;
				
			case 'D':
				System.out.println("Exiting.");
				break;
			
			default:
				System.out.println("Invalid Option");
				break;

			
			}
		} while(option != 'E');
		
		System.out.println("Thank You Come Again");
		
	}
	
	
}
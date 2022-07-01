package application;

import java.util.Scanner;

import model.entities.Account;
import model.exceptions.domainException;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter account data: ");		
		System.out.println("Number: ");
		int number = sc.nextInt();
		System.out.println("Holder: ");
		String holder = sc.nextLine();
		sc.next();
		System.out.println("Balance: ");
		int balance = sc.nextInt();		
		System.out.println("Withdraw Limit: ");
		int withdrawLimit = sc.nextInt();
		
		Account acc = new Account(number, holder, balance, withdrawLimit);
		
		System.out.println("Enter the amount for withdraw: ");
		int amount = sc.nextInt();
		
		try {
			acc.withdraw(amount);
		}
		catch(domainException e) {
			System.out.println("Withdraw error: " + e.getMessage());
		}
		
		sc.close();
	}
}

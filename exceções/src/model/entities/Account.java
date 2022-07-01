package model.entities;

import model.exceptions.domainException;

public class Account {
	private int number;
	private String holder;
	private double balance;
	private double withdrawLimit;
	
	public Account(int number,String holder,double balance, double withdrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}

	public int getNumber() {
		return number;
	}
	
	public String getHolder() {
		return holder;
	}

	public double getBalance() {
		return balance;
	}
	
	public double getWithdrawLimit() {
		return withdrawLimit;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) throws domainException{
		if(balance == 0 || balance < amount) {
			throw new domainException("Not enough balance");
		}
		if(amount > withdrawLimit) {
			throw new domainException("The amount exceeds withdraw limit"); 
		}
	}
}
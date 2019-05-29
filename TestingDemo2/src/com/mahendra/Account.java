package com.mahendra;

public class Account {
	private int accountNo;
	
	private String accHolderName;
	private double balance;
	
	private static final double MIN_BALANCE = 1000;

	public int getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	public String getAccHolderName() {
		return accHolderName;
	}

	public void setAccHolderName(String accHolderName) {
		this.accHolderName = accHolderName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public static double getMinBalance() {
		return MIN_BALANCE;
	}

	public Account(int accountNo, String accHolderName, double balance) {
		super();
		this.accountNo = accountNo;
		this.accHolderName = accHolderName;
		this.balance = balance;
	}

	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}

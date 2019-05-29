package com.mahendra;

public interface Transaction {
	
	boolean withdraw(int accNo, double amt);
	boolean deposit(int accNo,double amt);
	
}

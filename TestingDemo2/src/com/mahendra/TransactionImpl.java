package com.mahendra;

public class TransactionImpl implements Transaction {

	private AccountManager manager;
	
	public TransactionImpl(AccountManager manager) {
		super();
		this.manager = manager;
	}

	@Override
	public boolean withdraw(int accNo, double amt) {
		Account acc = manager.findByAccountNo(accNo);
		if(acc!=null) {
		acc.setBalance(acc.getBalance()-amt);
		return true;
		}else
			return false;
	}

	@Override
	public boolean deposit(int accNo, double amt) {
		Account acc = manager.findByAccountNo(accNo);
		if(acc!=null) {
			acc.setBalance(acc.getBalance()-amt);
			return true;
		}
		else
			return false;
	}
	
}

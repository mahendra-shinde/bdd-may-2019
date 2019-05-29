package com.mahendra;

import java.util.HashMap;
import java.util.Map;

public class AccountManager {
	private Map<Integer,Account> accounts = new HashMap<>();

	public Account findByAccountNo(int accNo) {
		return accounts.get(accNo);
	}

	public void setAccounts(Map<Integer, Account> accounts) {
		this.accounts = accounts;
	}
	
}

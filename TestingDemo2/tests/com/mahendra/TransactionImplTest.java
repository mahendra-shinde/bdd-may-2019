package com.mahendra;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TransactionImplTest {
	
	AccountManager accManager = new AccountManager();
	TransactionImpl impl = new TransactionImpl(accManager);
	
	@Before
	public void setUp() throws Exception {
		System.out.println("Populating sample data for TESTING!");
		Map<Integer,Account> sample = new HashMap<>();
		sample.put(101, new Account(101,"Kajal Agrawal",1230));
		sample.put(102,new Account(102,"Sonu Sood",1520));
		sample.put(103,new Account(103,"Prakash Rai",1899));
		sample.put(104,new Account(104,"Debashish",1000));
		accManager.setAccounts(sample);
	}

	@After
	public void tearDown() throws Exception {
		//Clear ALL sample data!
		accManager.setAccounts(new HashMap<>());
	}

	@Test
	public void testWithdraw() {
		impl.withdraw(102, 1000);
		assertEquals(520,accManager.findByAccountNo(102).getBalance(),0.01D);
	}
	@Test
	public void testWithdraw2() {
		impl.withdraw(104, 1000);
		//Expected balance is 1000 as MIN balance 1000 required
		assertEquals(1000,accManager.findByAccountNo(104).getBalance(),0.01D);
	}

	@Test
	public void testDeposit() {
		impl.deposit(103, 2000);
		assertEquals(3899,accManager.findByAccountNo(103).getBalance(),0.1D);
	}

}

package com.mahendra;

import static org.junit.Assert.*;

import org.junit.Test;

//Use Default Test Runner
public class CalculatorTest {

	//Define Object under TEST
	Calculator calc = new Calculator();
	
	@Test
	public void testDoSum() {
		double ans = calc.doSum(10,12);
		assertEquals(22, ans,0.01D);
	}

	@Test
	public void testDoSub() {
		double ans = calc.doSub(122,22);
		assertEquals(100, ans,0.01D);
	}

	@Test
	public void testDoMult() {
		double ans = calc.doMult(12, 2);
		assertEquals(24, ans,0.01D);
	}

	@Test
	public void testDoDiv() {
		assertEquals(5, calc.doDiv(25, 5),0.01);
	}

}

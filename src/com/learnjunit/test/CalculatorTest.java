package com.learnjunit.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.learnjunit.junit.Calculator;

public class CalculatorTest{
	/**
	 * junit 测试方法必须使用 @Test进行注释
	 * 所有的方法必须是 public void，方法不能带参数  
	 * 方法名称是被测方法前加上test
	 * */
	@Test
	public void testAdd() {
		/**
		 * assertEquals 方法是一个断言方法，第一个参数是预期的结果，第二个参数标识程序运行的结果
		 * 当预期结果和程序运行结果一致时候，表示单元测试成功
		 * */
		assertEquals(4, new Calculator().add(1, 3));
	}
	
	@Test
	public void testSubtract() {
		assertEquals(4, new Calculator().subtract(9,  4));
		// 抛出一个 Failures 显示 java.lang.AssertionError： expected <4> but was <5>
	}
	
	@Test
	public void testMultiply() {
		assertEquals(12, new Calculator().multiply(3, 4));
	}
	
	//可能会抛出的异常，当除以0的时候
	// 如果没有对异常进行预测，在执行的时候就会出现 Error 显示信息为
	// java.lang.ArithmeticException: / by zero
	@Test(expected=ArithmeticException.class)
	public void testDivide() {
		assertEquals(5, new Calculator().divide(25, 0));
	}
	
	
 }

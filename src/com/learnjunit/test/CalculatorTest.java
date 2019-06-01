package com.learnjunit.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.learnjunit.junit.Calculator;

public class CalculatorTest{
	/**
	 * junit ���Է�������ʹ�� @Test����ע��
	 * ���еķ��������� public void���������ܴ�����  
	 * ���������Ǳ��ⷽ��ǰ����test
	 * */
	@Test
	public void testAdd() {
		/**
		 * assertEquals ������һ�����Է�������һ��������Ԥ�ڵĽ�����ڶ���������ʶ�������еĽ��
		 * ��Ԥ�ڽ���ͳ������н��һ��ʱ�򣬱�ʾ��Ԫ���Գɹ�
		 * */
		assertEquals(4, new Calculator().add(1, 3));
	}
	
	@Test
	public void testSubtract() {
		assertEquals(4, new Calculator().subtract(9,  4));
		// �׳�һ�� Failures ��ʾ java.lang.AssertionError�� expected <4> but was <5>
	}
	
	@Test
	public void testMultiply() {
		assertEquals(12, new Calculator().multiply(3, 4));
	}
	
	//���ܻ��׳����쳣��������0��ʱ��
	// ���û�ж��쳣����Ԥ�⣬��ִ�е�ʱ��ͻ���� Error ��ʾ��ϢΪ
	// java.lang.ArithmeticException: / by zero
	@Test(expected=ArithmeticException.class)
	public void testDivide() {
		assertEquals(5, new Calculator().divide(25, 0));
	}
	
	
 }

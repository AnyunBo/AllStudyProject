package main;

import fib.FibDemo;

public class MainTest {

	public static void main(String[] args) {

		testFib();

	}

	public static void testFib() {
		int num = 60;

		//System.out.println(FibDemo.fib1(num));

		System.out.println(FibDemo.fib2(num));

		
		System.out.println(FibDemo.fib3(num));
		
	}

}

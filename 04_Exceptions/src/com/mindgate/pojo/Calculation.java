package com.mindgate.pojo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculation {
	private int num1;
	private int num2;
	private int result;

	public void accept() {
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println("enter number 1");
			num1 = scanner.nextInt();
			System.out.println("enter number 2");
			num2 = scanner.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("yess janhavi is mad........");
		}

		finally {
			scanner.close();
			System.out.println("thanks");
		}
	}

	public void calculate() {
		System.out.println("in calculate");
		result = num1 + num2;
	}

	public void display() {
		System.out.println("result is==" + result);
	}
}

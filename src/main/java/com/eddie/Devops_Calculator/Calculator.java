package com.eddie.Devops_Calculator;

import java.util.Scanner;

/*public class Calculator {
	public static void main(String[] args){
		System.out.println("6 + 3 = " + add(6, 3));
		System.out.println("6 - 3 = " + subtract(6,3));
		System.out.println("6 * 3 = " + multiply(6,3));
		System.out.println("6 / 3 = " + divide(6,3));
	}

	public static int add(int a, int b) {
		return a + b;
	}
	
	public static int subtract(int a, int b) {
		return a - b;
	}

	public static long multiply(int a, int b) {
		return a * b;
	}

	public static double divide(int a, int b) {
		double result;
		if (b == 0) {
			throw new IllegalArgumentException("Divisor cannot divide by zero");
		} else {
			result = Double.valueOf(a)/Double.valueOf(b);
		}
		return result;
	}

}*/


public class Calculator 
{
	public static void main(String[] args) 
	{

		Scanner scan = new Scanner(System.in);

		System.out.println("*******Simple-Calculator*********");
		
		//Creating Menu
		while(true)
		{
			System.out.println();
			System.out.println("Enter first number::");
			int firstNumber = scan.nextInt();
			System.out.println("Enter second number::");
			int secondNumber = scan.nextInt();
			
			System.out.println("To perform addition, Enter 1");
			System.out.println("To perform subtraction, Enter 2");
			System.out.println("To perform multiplication, Enter 3");
			System.out.println("To perform division, Enter 4");
			System.out.println("To Exit, Enter 9");

			System.out.println();
			System.out.println("Enter choice::");
			int choice = scan.nextInt();

			switch(choice)
			{
			case 1: System.out.println("Addition result= " + add(firstNumber, secondNumber));
			
			break;
			case 2: System.out.println("Subtraction result= " + subtract(firstNumber, secondNumber));
			
			break;
			case 3: System.out.println("Multiplication result= " + multiply(firstNumber, secondNumber));
			
			break;
			case 4: System.out.println("Division result= " + divide(firstNumber, secondNumber));
			
			break;
			case 9: System.out.println("Thanks.Visit Again.");
			System.exit(0);
			break;
			default: System.out.println("Incorrect input!!! Please re-enter choice from our menu");
			}
		}

	}
	
	//Method for addition
	public static int add(int num1, int num2){
		return num1+num2;
		
		
	}
	//Method for subtraction
	public static int subtract(int num1, int num2){
		return num1-num2;
		
	}
	//Method for multiplication
	public static long multiply(int num1, int num2){
		return num1*num2;
		
	}
	//Method for division
	public static double divide(int num1, int num2){
		double result;
		
		if (num2 == 0) {
			throw new IllegalArgumentException("Divisor cannot divide by zero");
		} else {
			result = Double.valueOf(num1)/Double.valueOf(num2);
	
		}
		return result;
	}
}
	










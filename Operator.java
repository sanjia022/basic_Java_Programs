package javaprograms;

import java.util.Scanner;

//Accept two numbers from user and perform all the Arithmetic operations(+,-, *, /, %) 


public class Operator {
	
	static Scanner n1 = new Scanner (System.in);
	public static void addition() {
		
		System.out.println("Please enter the first number");
		int a = n1.nextInt();
		System.out.println("Please enter the Second number");
		int b = n1.nextInt();
		int sum = a + b;
		System.out.println("The sum is "+ sum);
		
	}
	
	public static void substraction() {
		
		System.out.println("Please enter the first number");
		int a = n1.nextInt();
		System.out.println("Please enter the Second number");
		int b = n1.nextInt();
		int substraction = a - b;
		System.out.println("The answer is "+ substraction);
		
	}
    public void multiplication() {
		
		System.out.println("Please enter the first number");
		int a = n1.nextInt();
		System.out.println("Please enter the Second number");
		int b = n1.nextInt();
		int multiplication = a % b;
		System.out.println("The answer is "+ multiplication);
		
	}
	public static void main(String[] args) {
		addition();
		substraction();
		Operator a1 = new Operator();
		a1.multiplication();
		n1.close();
	}
	
}

package javaprograms;

import java.util.Scanner;

//Accept number from user and Write a program to check Number is even or odd by using if else statement 
public class Odd_Even_Number {
	public static void main(String[] args) {
		Scanner n1 = new Scanner (System.in);
		System.out.println("Enter a number");
		int number = n1.nextInt();
		if(number %2 == 0) {
			System.out.println("the number is even");
		}
		else {
			System.out.println("The number is odd");
		}
		n1.close();
	}

}

package javaprograms;

import java.util.Scanner;

class Parent{
	
void addition() {
		Scanner n1 = new Scanner(System.in);
		System.out.println("Please enter the first number");
		int a = n1.nextInt();
		System.out.println("Please enter the Second number");
		int b = n1.nextInt();
		int sum = a + b;
		System.out.println("The sum is "+ sum);
		n1.close();
	}
}
public class Single_Inheritance extends Parent {
	    void number() {
		int a = 13;
		int b = 12;
		int total = a+b;
		System.out.println(total);
		
	}
	
	public static void main(String[] args) {
		
		Single_Inheritance  a1 = new Single_Inheritance();
		a1.addition();
		a1.number();
		}
		
	}



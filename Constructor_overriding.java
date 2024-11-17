package basicjavaprogram;

import java.util.Scanner;

public class Constructor_overriding {
	
	static Scanner scanner = new Scanner(System.in);
	
	
	 public Constructor_overriding(){
		System.out.println("Please enter your age");
		int age = scanner.nextInt();
		if (age>=18) {
			System.out.println("You are eligible for vote");
		}
		else {
			System.out.println("You are not eligible for vote.");
		}
		
		
				
	}
	 
	 Constructor_overriding(int a){
			System.out.println("Thank You!");
		}
	public static void main(String[] args) {
		// to call the constructor, we need just create an object
		//1 way to object creation is below
		//Constructor_overriding a2 = new Constructor_overriding();
		// 2 way to object creation by syntax "new nameOfTheClass()"
		new Constructor_overriding();
		new Constructor_overriding(34);
		scanner.close();
		
	}
	
}

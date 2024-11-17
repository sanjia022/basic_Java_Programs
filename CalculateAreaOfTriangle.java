package basicjavaprogram;

import java.util.Scanner;

/*Assignment 19 Accept input from user and calculate Area of Triangle(formula - (b*h)/2)
 */

public class CalculateAreaOfTriangle {
	
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("Please enter the base of the triangle");
		int base = scanner.nextInt();
		
		System.out.println("Please enter the height of the triangle");
		int height = scanner.nextInt();
		
		int area = (base * height)/2;
		System.out.println("The area of the triangle is " + area);
        scanner.close();

	}

}

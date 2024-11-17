package javaprograms;

import java.util.Scanner;

//Accept input from user and calculate Area of Triangle(formula - (b*h)/2

public class Area_Of_Triangle {
	public static void main(String[] args) {
		Scanner n1 = new Scanner (System.in);
		System.out.println("Enter the base of the triangle");
		int base = n1.nextInt();
		
		System.out.println("Enter the height of the triangle");
		int height = n1.nextInt();
	    int area = (base*height)/2;
		System.out.println("The area of the triangle is " + area);
		n1.close();
	}

}

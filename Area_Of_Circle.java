package javaprograms;

import java.util.Scanner;

//Accept number from user and calculate Area of circle (formula πr square, PI=3.1
public class Area_Of_Circle {
	static public void main(String[] args) {
		Scanner n1 = new Scanner (System.in);
		System.out.println("Enter the radius of the circle");
		double radius = n1.nextDouble();
		System.out.println("The Area of an circle is " + (Math.PI* Math.sqrt(radius)));
		n1.close();
	}

}

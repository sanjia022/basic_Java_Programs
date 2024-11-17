package javaprograms;

import java.util.Scanner;

//an Array of int data type of size four the values are 100,200, 300 and 400.Check if the given number is a part of Array or not?
public class PartOfTheArrayOrNot {

	public static void main(String[] args) {
		int value[] = new int [4];
		
		value[0] = 12;
		value[1] = 45;
		value[2] = 78;
		value[3] = 32;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		 int givenNumber = scanner.nextInt();
		 
		 
		 for(int i= 0; i<value.length;i++) {
		 if(givenNumber == value[i]){
			 System.out.println("This number is part of the array");
		 }
		 else {
			 System.out.println("This number is not part of the array");
		 }
		 scanner.close();
		 }
		 

	}

}

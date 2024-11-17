package javaprograms;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayScanner {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
	System.out.println("enter the number");
	
	int num[] = new int[2];
	for(int i = 0; i<num.length;i++) {
	num[i] = scanner.nextInt();
	}
	System.out.println(Arrays.toString(num));
	scanner.close();
	}

}

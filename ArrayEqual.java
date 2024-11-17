package javaprograms;
//WAP to check if the two Arrays are equals to each other
import java.util.Arrays;

public class ArrayEqual {
	public static void main(String[] args) {
		int array1[] = new int [3];
		array1[0] = 12;
		array1[1] = 52;
		array1[2] = 45;
		
		int array2[] = new int[3];
		array2[0] = 45;
		array2[1] = 78;
		array2[2] = 66;
		
		boolean value = (Arrays.equals(array1, array2));
		if(value ==true) {
			System.out.println("The two arrays are same ");
		}
		else {
		System.out.println("The two arrays are not same.");
		}
	}

}

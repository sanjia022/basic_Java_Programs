package javaprograms;

import java.util.Arrays;

public class Arrayequal_1 {

	public static void main(String[] args) {
		int roll[] = new int[3];
		roll[0] = 12;
		roll[1] = 36;
		roll[2] = 82;
		int roll1[] = new int[3];
		roll1[0] = 112;
		roll1[1] = 316;
		roll1[2] = 812;
		
		boolean a = Arrays.equals(roll, roll1);
		System.out.println(a);
	}

}

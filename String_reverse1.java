package javaprograms;

import java.util.Arrays;

public class String_reverse1 {

	public static void main(String[] args) {
		
		String name = "cafe";
	    int a1 = name.length();
	    
	    String name2= "face";
		int a2 = name2.length();
		
		if(a1 !=a2) {
			System.out.println("It is not a anagram");
		}
		else {
			char[] a3 = name.toCharArray();
			char[] a4 =name2.toCharArray();
			
			System.out.println(Arrays.toString(a3));
			System.out.println(Arrays.toString(a4));
			
			Arrays.sort(a3);
			Arrays.sort(a4);

			System.out.println(Arrays.toString(a3));
			System.out.println(Arrays.toString(a4));
			
			boolean a6 = Arrays.equals(a3, a4);
			System.out.println(a6);
		}
		
		
		
	}

}

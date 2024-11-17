package javaprograms;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String name = "face";
		String name1 = "cafe";
		
		if(name.length() != name1.length()) {
			System.out.println("There are not Anamgram");
		}
		else {
			char [] a =name.toCharArray();
			char [] b =name.toCharArray();
			
			Arrays.sort(a);
			Arrays.sort(b);
			
			boolean answer = Arrays.equals(a, b);
			System.out.println(answer);
		}

	}

}

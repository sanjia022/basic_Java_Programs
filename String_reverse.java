package javaprograms;

public class String_reverse {

	public static void main(String[] args) {
		String name = "ishita"; 
		String name2 =""; 
		
		for(int i = name.length()-1; i>=0; i--) {
		char a1 = name.charAt(i);
		name2 = name2+a1;
		
		
		}
		System.out.println(name2);
		if(name2.equals(name)) {
			System.out.println("it is a palingdrome");
		}
		else {
			System.out.println("It is not a palingdrome");
		}
		
	}
	
}

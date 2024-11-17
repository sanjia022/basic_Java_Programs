package javaprograms;

public class String_function {

	public static void main(String[] args) {
		String name= " david";
		String name1 = "smith";
		
		System.out.println(name.trim());
		System.out.println(name1.charAt(3));
		System.out.println(name1.substring(0, 4));
		
		for(int i= 0; i>name.length(); i++) {
		char a1 = name.charAt(i);
		System.out.println(a1);
		}
	}

}

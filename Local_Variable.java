package javaprograms;

public class Local_Variable {
	static boolean c; 
	
	public static void main(String[] args) {
		
		byte age;
		age = 12;
		System.out.println("The age is " + age + ".");
		short a = 32000;
		a= 32211;
		System.out.println(a);
		
	
	boolean b = false;
	System.out.println(c);
	System.out.println(b);
	
	int sum = age + a;
	System.out.println(sum);
	int division = a/age; 
	System.out.println(division);
	int modulus = a%age;
	System.out.println(modulus);
		int f = 16;
		int g = 3;
		System.out.println(f/g);
	}

}

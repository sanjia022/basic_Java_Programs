package basicjavaprogram;

public class CallingMethod {
	
	public static void add() {
		System.out.println("I am a adding static method");
	}
    
	public static void add(int a) {
		System.out.println("I am a adding method with one parameter");
	}
	
	public void multiplication(int a, int b) {
		System.out.println(a*b); 
	}
	
	public void division(int a , int b) {
		System.out.println(a/b);
	}
	public static void main(String[] args) {
		add();
		add(12);
		CallingMethod a1 = new CallingMethod();
		a1.division(100, 45);
        a1.multiplication(45, 4);		
	}

}

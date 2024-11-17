package basicjavaprogram;

class SuperClass{
	void add(int a ) {
		System.out.println("super class");
	}

}
public class MethodOverriding extends SuperClass{
	
	void add(int a) {
		//super.add(45);
		System.out.println("methodloading");
		super.add(45);
	}
	
	
	public static void main(String[] args) {
		MethodOverriding a1 = new MethodOverriding();
		a1.add(0);
	}

}

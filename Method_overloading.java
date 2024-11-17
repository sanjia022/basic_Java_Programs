package basicjavaprogram;

public class Method_overloading {
	
	static int a = 12; 
	static int b = 45;
	
	public  void  add() {// method overloading can be possible for static and non static methods
		int sum = a + b;
		System.out.println("The sum of these two numbers is " + sum);
	}
	public static void  add(int a, int b) {
		int sum = a + b;
		System.out.println("The sum is " + sum);
	}
	public static void  add(int a , int b, int c) {
		int sum = a + b + c;
		System.out.println( "The sum is " + sum);
	}
	public static void main(String[] args) {
		Method_overloading a1 = new Method_overloading();// for non static method, we need to create an object and with the help of its variable we can call the method
		a1.add();
		add(45,98);// for static method we can just call the method by its name
		add(67,98,85);
		

	}

}

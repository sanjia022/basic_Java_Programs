package basicjavaprogram;

public class LocalVariable {
	
	static String a = "David";
	static String v;

	public static void add() {
		int a = 23;
		int b = 12;
		int sum = a+b;
		System.out.println(sum);
	}
	public void add(int a,int b) {
		int sum = a+b;
		System.out.println(sum);
	}
	public static void main(String[] args) {
		add();
		
		
		LocalVariable s1 = new LocalVariable();
		s1.add(12, 78);
		System.out.println("My name is "+ a);
		System.out.println("My name is "+ v);
	}

}

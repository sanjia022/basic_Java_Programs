package javaprograms;

abstract class Amazon{
	abstract void add();
	abstract void add1();
	static void add3() {
		System.out.println("Add3 CM inside the AC");
	}
}

abstract class Amazon1 extends Amazon{
	public static void add2() {
		System.out.println("add2 CM");
	}
	void add() {
		System.out.println("Overiden here");
		
	}

	
	void add1() {
		
		
	}

}

public class Abstract_multilevel extends Amazon1{

	public static void main(String[] args) {
		add2();
		Abstract_multilevel a1 = new Abstract_multilevel();
		a1.add();
		a1.add1();
		add3();

	}

	
	
}

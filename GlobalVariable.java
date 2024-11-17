package basicjavaprogram;

public class GlobalVariable {
	
	int number;
	String name;
	
	void details(int a, String name) {
		this.name = name;
		this.number = a;
		
	}

	public static void main(String[] args) {
		GlobalVariable a2 = new GlobalVariable();
		a2.details(12, "kjlkj");
		System.out.println();
		
		

	}

}

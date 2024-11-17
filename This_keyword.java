package basicjavaprogram;

//This keyword uses only in non static context(non static variable and methods. only used in non static parameterized method)

public class This_keyword {
	int age;
	String name;
	double salary;
	
	void details(int age, String name,double salary) {
		System.out.println("Students");
		this.age =45;
		this.name ="David";
		
	}

	public static void main(String[] args) {
		This_keyword t1 = new This_keyword();
		t1.details(78, "Manish", 12.123);
		System.out.println(t1.age);
		System.out.println(t1.name);
		System.out.println(t1.salary);

	}

}

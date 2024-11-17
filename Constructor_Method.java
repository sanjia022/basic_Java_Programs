package basicjavaprogram;

public class Constructor_Method {
	
	public Constructor_Method() {
		System.out.println("I am a non parameterized constructor.");
	}
	Constructor_Method(String name){
		System.out.println("I am a paramerterized constructor.");
	}
	
	public static void main(String[] args) {
		//Constructor_Method a1 = new Constructor_Method();
		new Constructor_Method();
		new Constructor_Method("sanjia");
		
	}

}

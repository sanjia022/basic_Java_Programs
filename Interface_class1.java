package javaprograms;

 interface Google10{
	void logIn();
	void registration();
}

class Amazon10 implements Google10{
	void registrationAmazon() {
		System.out.println("I am amazon registration page");
	}
	@Override
	public void logIn() {
		System.out.println("I am google login page");
		
	}
	@Override
	public void registration() {
		System.out.println("I am google registration page");
		
	}
	static void loginAmazon() {
		System.out.println("I am amazon log in page");
	}
	
}
public class Interface_class1 extends Amazon10{

	public static void main(String[] args) {
		loginAmazon();
		Interface_class1 a1 = new Interface_class1();
		a1.registrationAmazon();
		a1.logIn();
		a1.registration();
	}

}

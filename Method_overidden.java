package basicjavaprogram;

class parent{
	void login() {
		System.out.println("Loging with email");
	}
}
public class Method_overidden extends parent {
	
	void login() {
		
		System.out.println("Login with phone number");
		super.login();
	}

	public static void main(String[] args) {
		Method_overidden n1 = new Method_overidden ();
		n1.login();

	}

}

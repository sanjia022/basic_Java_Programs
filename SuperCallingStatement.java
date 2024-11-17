package basicjavaprogram;

class Google{
	
	Google(int a){
		System.out.println("google");
	}
}

public class SuperCallingStatement extends Google{
	
	
		SuperCallingStatement(){
			super(45);
		System.out.println("Amazon");
		}
	

	public static void main(String[] args) {
		new SuperCallingStatement();
		
	
}
}
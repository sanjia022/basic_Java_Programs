package basicjavaprogram;

public class ThisCallingStatement {
	
	ThisCallingStatement(int a){
		System.out.println("int");
	}
	ThisCallingStatement(String name){
		this(12);
		System.out.println("String");
	}
	ThisCallingStatement(){
		this("sanjia");
		System.out.println("no parameter");
	}

	public static void main(String[] args) {
		new ThisCallingStatement();

	}

}

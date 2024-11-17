package javaprograms;

public class Reverse_String {
	public static void main(String[] args) {
		String a = "Sanjia";
		
		String output = "";
		
		for(int i=5; i>=0; i--){
	    char a1 = a.charAt(i);
	    output = output + a1;
	    
		}
		
		System.out.println(output);
		
		if(output.equals(a)) {
			System.out.println("It is a Plaindrome");
		}
		else {
			System.out.println("It is not a Plaindrome");
		}
	}

}

package javaprograms;



public class Plaindrome {

	public static void main(String[] args) {
		String value = "mome";
		String output ="";
		
		for(int i=value.length()-1; i>=0;i--) {
		char a1 = value.charAt(i);
		output = a1 + output;
		
		}
		
		System.out.println(output);
		if(output==value) // or we can use equal method from String class 
			{
			System.out.println("It is a plaindome");
		}
		else {
			System.out.println("It is not a plaindome");
		}
	}

}

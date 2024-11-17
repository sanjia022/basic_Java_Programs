package basicjavaprogram;

public class Plaindrom {

	public static void main(String[] args) {
		
		String a = "mom";
		String b = "";
		
		for(int i=a.length()-1; i >=0; i--) {
		char last = a.charAt(i);
		b= b+ last;
		
		}
		System.out.println(b);
		if(b.equals(a)) {
			System.out.println("it is palindrome");
			
		}
		else {
			System.out.println("it is not palindrome");
		}
	
		}
	}



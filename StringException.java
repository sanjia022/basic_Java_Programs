package ExceptionHandling;



public class StringException {

	public static void main(String[] args) {
		
		String a = "sanjia";
		
		try {
			for(int i = 0; i< a.length(); i++) {
		char a1 = a.charAt(i);
		System.out.println(a1);
			}
		}
		catch(StringIndexOutOfBoundsException e) {
			
		}
	}

}
//StringIndexOutOfBoundsException
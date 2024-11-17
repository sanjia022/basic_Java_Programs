package ExceptionHandling;

public class ThowKeyword {

	public static void main(String[] args) throws StringIndexOutOfBoundsException, InterruptedException

	{
		Thread.sleep(2000);
        //syntax #1 for throw an exception
		//throw new StringIndexOutOfBoundsException();
		
	//syntax #2 for throw an exception	
       throw new StringIndexOutOfBoundsException("Throw");
		

	}

}

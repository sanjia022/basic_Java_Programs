package javaprograms;

public class Global_Variable {
	
	double pi;
	static int a;
	static double pii = 23.21;

	public static void main(String[] args) {
		Global_Variable a1 = new Global_Variable();
        System.out.println(a1.pi);
        System.out.println(a1.pi = 12);
        System.out.println(a);
        a = 12;
        System.out.println(a);
        System.out.println(pii);
        
        pii = 12.32;
        System.out.println(pii);
        
        
	}

}

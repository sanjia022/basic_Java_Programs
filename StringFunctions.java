package javaprograms;

public class StringFunctions {

	public static void main(String[] args) {
		
		
		String name = "Sanjia";
		String name1 = " Amreen";
		System.out.println(name.trim());
		System.out.println(name.length());
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		System.out.println(name.charAt(2));
		System.out.println(name.indexOf('n'));
		System.out.println(name.substring(2));
		System.out.println(name.substring(0, 3));
		String name3 = name.concat(name1);
		System.out.println(name3);
		System.out.println(name.equals(name1));
		System.out.println(name.equalsIgnoreCase(name1));
		System.out.println(name.toCharArray());
		System.out.println(name.matches("(.*)n"));
		System.out.println(name3.contains(name));
		
		
	}

}

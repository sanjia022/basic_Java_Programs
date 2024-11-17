package javaprograms;

import java.util.Arrays;

//WAP to copy the value of Array into another array
public class CopyAnArrayToAnother {
public static void main(String[] args) {
	

	int salary [] = new int[2];
    salary[0] = 123;
    salary[1] = 123;
    
    int salary1 [] = new int[2];
    
    for(int i = 0 ; i<salary.length; i++) {
    	salary1[i] = salary [i];
    	
    }
    System.out.println(Arrays.toString(salary1));
}
}
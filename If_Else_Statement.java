package javaprograms;

import java.util.Scanner;

//WAP if age is greater than equals to 18 then you can vote else you can not vote"
public class If_Else_Statement {
	static int voter_age = 18;

	public static void main(String[] args) {
		Scanner n1 = new Scanner(System.in);
		System.out.println("Please enter you age");
		int age = n1.nextInt();
		if(age>=voter_age) {
			System.out.println("You are eligible to vote");
		}
		else {
			System.out.println("Sorry! you are not eligible to vote.");
		}
		n1.close();

	}

}

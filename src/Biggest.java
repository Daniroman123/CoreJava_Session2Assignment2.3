
/*Write a program to write the highest among given 3 numbers
  
  
 NOTE : Formatting and indentation is done automatically by SaveActions setting in Eclipse*/

import java.util.Scanner; // teext scanner package

public class Biggest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // invoke Constructor of Scanner
												// class with argument System.in

		System.out.println("Enter the value of a ");
		int a = sc.nextInt(); // taking value a from the user

		System.out.println("Enter the value of b ");
		int b = sc.nextInt(); // taking the value b from the user

		System.out.println("Enter the value of c ");
		int c = sc.nextInt(); // taking the value c from the user

		sc.close(); // method to close the scanner , good practice

		if (a > b) { // check if a larger than b
			if (a > c) // check if a larger than c
				System.out.println("a=" + a + " is the largest ");
			else if (a == c) // check if (a = c ) > b
				System.out.println("a=c=" + a + " are both the largest ");
		}
		if (b > c) { // check if b larger than c
			if (b == a) // check if (b = a) > c
				System.out.println("a=b=" + a + " are both the largest ");
			else
				System.out.println("b=" + b + " is the largest ");
		}

		else if (b == c) { // check if ( b = c ) > a
			if (a == b) // checks if a = (b = c)
				System.out.println("a=b=c=" + b + " are all equal ");
			else
				System.out.println("b=c=" + b + " are both the largest ");
		}

		else
			System.out.println("c=" + c + " is the largest ");

	}
}
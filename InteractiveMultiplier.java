/**
create a simple program to multiply two numbers
Take input from user with any 2 integers
*/

import java.util.Scanner;

public class InteractiveMultiplier{
	public static void main (String[]args){
		Scanner sc; //create type scanner
		sc = new Scanner(System.in); // create object of type scanner to take user input

		int num1, num2, result;
		//display msg
		System.out.println("Enter first number: ");
		num1 = sc.nextInt();
		System.out.println("Enter second number: ");
		num2 =sc.nextInt();
		//processing
		result = num1 * num2;
		//output
		System.out.println(num1 +" * "+ num2 + " = " +result);
	}
}
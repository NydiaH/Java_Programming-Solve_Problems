import java.util.Scanner;

public class InteractiveCarpetFinalPrice{
	public static void main (String []args){
		//create variables
		double width, length, totalCost;
		//create type scanner
		Scanner sc = new Scanner(System.in);

		//input
		//dispaly msg, then store user input
		System.out.println("Please enter width");
		width = sc.nextDouble();
		System.out.println("Please enter length");
		length = sc.nextDouble();
		//Declare a constant so vaule wont be changed
		//use final keyword for Constants, constant name have to be capital letter
		final double PRICE = 100;

		//processing
		totalCost  = width * length * PRICE;
		//output
		System.out.println ("Total price for carpet is " + totalCost + " euros.");
	}
}
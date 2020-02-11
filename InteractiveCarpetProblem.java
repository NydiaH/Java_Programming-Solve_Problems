import java.util.Scanner;

public class InteractiveCarpetProblem{
	public static void main (String []args){
		//create variables
		double width, length, price, totalCost;
		//create type scanner
		Scanner sc = new Scanner(System.in);

		//input
		//dispaly msg, then store user input
		System.out.println("Please enter width");
		width = sc.nextDouble();
		System.out.println("Please enter length");
		length = sc.nextDouble();
		System.out.println("Plese enter price per square meter");
		price = sc.nextDouble();

		//processing
		totalCost  = width * length * price;
		//output
		System.out.println ("Total price for carpet is " + totalCost + " euros.");
	}
}
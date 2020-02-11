import java.util.Scanner;

public class ConvertLiterPint{
	public static void main(String []args){

	//create type scanner named sc, and create object of type scanner
	Scanner sc = new Scanner(System.in);
	//create 3 variables and 1 constant
	double milli, liter, pint;
	//create constant
	final double literToPint = 2.11;
	//input
	System.out.println("Enter the value of milliliters: ");
	milli = sc.nextDouble();


	//processing
	liter = milli/1000;
	pint = liter * literToPint;

	//output
	System.out.println(milli + " milliliters = " + liter + " liters.");
	System.out.println(milli +  " milliliters = "+ pint + " pints.");

	}
}

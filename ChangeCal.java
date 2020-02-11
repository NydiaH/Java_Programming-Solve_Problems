import java.util.Scanner;

public class ChangeCal{
	public static void main(String []args){


	int price, receive, change;
	Scanner sc=new Scanner(System.in);


	//input
	//print msg
	System.out.println("Enter total price");
	price = sc.nextInt();
	System.out.println("Enter how much received");
	receive = sc.nextInt();

	//processing
	change=receive - price;
	System.out.println("The change will be " + change +" euros");

	//break it down for notes
	int pay50, pay20, pay10, pay5, pay2, pay1;

	//check how many 50 notes
	pay50= change / 50;
	//update change
	change= change - 50*pay50;
	//check how many 20 notes
	pay20= change/20;
	change = change - 20*pay20;
	pay10=change/10;
	change= change - 10*pay10;
	pay5 = change/5;
	change = change - 5*pay5;
	pay2 = change/2;
	change = change - 2*pay2;
	pay1 = change/1;
	// no need to update change after1

	//output
	System.out.println("50 Euro note(s): " + pay50);
	System.out.println("20 Euro note(s): " + pay20);
	System.out.println("10 Euro note(s): " + pay10);
	System.out.println("5 Euro note(s): " + pay5);
	System.out.println("2 Euro coin(s): " + pay2);
	System.out.println("1 Euro coin(s): " + pay1);
	}

}
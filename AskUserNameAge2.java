import java.util.Scanner;
public class AskUserNameAge2{
	public static void main (String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your name");

		String name = sc.nextLine();
		System.out.println("How old are you");
		int userAge = sc.nextInt();
		System.out.println("Hi " + name + ", you are " + userAge + " yrs old!");
	}
}

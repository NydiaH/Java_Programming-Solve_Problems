import java.util.Scanner;

public class AskUserNameAge{
	public static void main (String [] args){
		String userName;
		int age;

		Scanner sc = new Scanner(System.in);
		//msg ask user name
		System.out.println("What is your name");
		//store value for variable userName
		userName = sc.nextLine();

		//msg ask user age
		System.out.println("How old are you");
		//store value to variable age
		age = sc.nextInt();

		System.out.println("Hello "+ userName + " You are " + age + "yrs old");
	}
}
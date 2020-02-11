/**accepts the radius of a circle from
the user as input. The program computes and displays the area of the circle.*/
//area = PI * radius * radius;
import java.util.Scanner;

public class Circle{
public static void main (String [] args){
	double radius; //create variable
	final double PI = 3.14; //declare constant(capital)

	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the value of radius");
	radius = sc.nextDouble();
	//processing
	double area = radius * radius * PI;

	System.out.println("The area of a circle with radius: " +radius + " is " + area);

}
}

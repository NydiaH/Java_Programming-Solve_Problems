public class CarpetProblem{
	public static void main (String []args){
		double area;
		double totalCost;
		double length;
		double width;
		double price;

		width=7;
		length = 5;
		price = 20;
		area=width*length;
		totalCost=area*price;
		System.out.println("The total price for carpet is " + totalCost + " euros");
	}
}
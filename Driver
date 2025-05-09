import java.util.Scanner;
public class Driver {
	public static void main(String[] args) {
		
		//Taking users input for cylinder details
		Scanner input = new Scanner(System.in);
		CylinderPyramid cylinder = new CylinderPyramid();
		
		//User inputs the bottom cylinder's radius
		System.out.print("Enter the radius of the bottom cylinder: ");
		double userRadius = input.nextDouble();
		cylinder.setRadius(userRadius);
		System.out.println("getRadius() is: " + cylinder.getRadius());
		
		//User inputs the bottom cylinder's height
		System.out.print("Enter the height of the bottom cylinder: ");
		double userHeight = input.nextDouble();
		cylinder.setHeight(userHeight);
		System.out.println("getHeight() is: "+ cylinder.getHeight());

		//Create object
		//CylinderPyramid cylinder1 = new CylinderPyramid(userRadius, userHeight);
		
		System.out.printf("total: %.3f cm3%n", cylinder.calculation());
		//Method call
		//double total = cylinder1.calculation();
		
		//Print result
		//System.out.printf("The total volume of the pyramid cylinder is: %.3f cm3%n" , total);
		System.out.println("Program by Fiona .");
		
		input.close();
	}
}

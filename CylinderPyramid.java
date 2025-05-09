public class CylinderPyramid {
	
	//variables
	private double radius;
	private double height;
	private final double TWENTY = 0.20; //a constant variable for 20%
	
	//default constructor
	public CylinderPyramid() {
		
	}
	
	//Overloaded constructor
	public CylinderPyramid(double radius, double height) {
		this.radius = radius;
		this.height = height;
	}
	
	//Getter for radius
	public double getRadius() {
		return radius;
	}
	
	//Setter for radius
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	//Getter for height
	public double getHeight() {
		return height;
	}
	
	//Setter for height
	public void setHeight(double height) {
		this.height = height;
	}
	
	//Calculation; work method
	public double calculation() {
		double bottomCylinder = radius * radius * height * Math.PI;
		double dRadius = radius - (radius * TWENTY);
		double middleCylinder = dRadius * dRadius * height * Math.PI;
		double dRadius1 = dRadius - (dRadius * TWENTY);
		double topCylinder = dRadius1 * dRadius1 * height * Math.PI;
		double totalVol = bottomCylinder + middleCylinder + topCylinder;
		return totalVol;
	}
}

package lab3_package;
import java.math.*;
public class Triangle {
	private Point pointA;
	private Point pointB;
	private Point pointC;
	
	public Triangle(double x_a, double y_a, double x_b, double y_b, double x_c, double y_c)
	{
		this.pointA = new Point(x_a,y_a);
		this.pointB = new Point(x_b,y_b);
		this.pointC = new Point(x_c,y_c);
	}

	public double count_Circuit()
	{
		return pointA.discance(pointB) + pointB.discance(pointC) + pointC.discance(pointA);
	}
	public double count_area()
	{
		double summary,help=0.5;
		double h_c=0;
		double h_c1 = this.count_Circuit();
		h_c= h_c1 * help;
		summary = (h_c*(h_c - pointA.discance(pointB))*(h_c - pointB.discance(pointC))*(h_c - pointC.discance(pointA)));
		return Math.sqrt(summary);
	}
	public double high_Triangle(int witch_one)
	{
		if(witch_one == 1) return (((count_area()*2))/(pointB.discance(pointC)));
		if(witch_one == 2) return ((count_area()*2)/pointC.discance(pointA));
		if(witch_one == 3) return ((count_area()*2)/pointA.discance(pointB));
		else return 0;
	}
	public void changeCoordinateX(double x)
	{
		this.pointA.setX(x);
	}
	public void changeCoordinateY(double y)
	{
		this.pointA.setY(y);
	}
	
	public void changeCoordinateXB(double x)
	{
		this.pointB.setX(x);
	}
	public void changeCoordinateYB(double y)
	{
		this.pointB.setY(y);
	}
	
	public void changeCoordinateXC(double x)
	{
		this.pointC.setX(x);
	}
	public void changeCoordinateYC(double y)
	{
		this.pointC.setY(y);
	}
	
	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}
	
	@Override 
	public String toString()
	{
		return pointA.toString() + pointB.toString() + pointC.toString();
	}
}

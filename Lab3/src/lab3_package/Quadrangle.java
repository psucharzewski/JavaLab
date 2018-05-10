package lab3_package;
//import java.math.*;
public class Quadrangle {
	private Point pointA;
	private Point pointB;
	private Point pointC;
	private Point pointD;
	
	public Quadrangle(double x_a,double y_a,double x_b, 
			double y_b, double x_c, double y_c, double x_d, double y_d)
	{
		this.pointA = new Point(x_a,y_a);
		this.pointB = new Point(x_b,y_b);
		this.pointC = new Point(x_c,y_c);
		this.pointD = new Point(x_d,y_d);
	}
	
	public double diagonalAC()
	{
		return pointA.discance(pointC);
	}
	public double diagonalBD()
	{
		return pointB.discance(pointD);
	}
	public double count_Circuit()
	{
		return pointA.discance(pointB) + pointB.discance(pointC) 
		+ pointC.discance(pointD) + pointD.discance(pointA);
	}
	public double countSinus()
	{
		double degrees = Math.toDegrees(this.angleBetween2Lines());
		double radians = Math.toRadians(degrees);
		return Math.sin(radians);
	}
	public double angleBetween2Lines()
	{
	    double angle1 = Math.atan2(pointA.getY() - pointC.getY(),
	    		pointA.getX() - pointC.getX());
	    double angle2 = Math.atan2(pointB.getY() - pointD.getY(),
	    		pointB.getX() - pointD.getX());
	    return Math.abs(angle1)-Math.abs(angle2);
	}
	public double countArea()
	{
		double area;
		area = (this.diagonalAC()*this.diagonalBD()/2)*this.countSinus();
		return area;
		
	}
	@Override 
	public String toString()
	{
		return pointA.toString() + pointB.toString() + pointC.toString() + pointD.toString();
	}
}

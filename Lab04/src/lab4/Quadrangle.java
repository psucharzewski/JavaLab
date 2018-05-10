package lab4;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.*;

public class Quadrangle extends Polygon {
	private Point pointA;
	private Point pointB;
	private Point pointC;
	private Point pointD;
	
	public Quadrangle(int x_a,int y_a,int x_b, 
			int y_b, int x_c, int y_c, int x_d, int y_d)
	{
		this.pointA = new Point(x_a,y_a);
		this.pointB = new Point(x_b,y_b);
		this.pointC = new Point(x_c,y_c);
		this.pointD = new Point(x_d,y_d);
		Polygon.theNumberOfTheBeast++;
	}
	@Override
		public void draw(Graphics graph)
		{
		    int xpoints[] = {pointA.getX(),pointB.getX(),pointC.getX(),pointD.getX()};
		    int ypoints[] = {pointA.getY(),pointB.getY(),pointC.getY(),pointD.getY()};
		    int npoints = 4;
		    this.setColor(0);
		    graph.setColor(myColor);
		    graph.drawPolygon(xpoints, ypoints, npoints);
		    graph.fillPolygon(xpoints, ypoints, npoints);
		}
	public double diagonalAC()
	{
		return pointA.discance(pointC);
	}
	public double diagonalBD()
	{
		return pointB.discance(pointD);
	}
	@Override
	public double countPermiter()
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
	@Override
	public double countArea()
	{
		double area;
		area = (this.diagonalAC()*this.diagonalBD()/2)*this.countSinus();
		return area;
		
	}
	/*@Override 
	public String toString()
	{
		return pointA.toString() + pointB.toString() + pointC.toString() + pointD.toString();
	}*/

		public Color getMyColor() {
			return myColor;
		}

		public void setMyColor(Color myColor) {
			this.myColor = myColor;
		}
}

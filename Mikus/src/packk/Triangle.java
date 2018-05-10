package packk;

import java.awt.Color;
import java.awt.Graphics;



public class Triangle
{
	private Point a;
	private Point b;
	private Point c;
	private Color FigureColor;
	
	public Triangle(Point a, Point b, Point c)
	{
		this.a = a;
		this.b = b;
		this.c = c;
		FigureColor = new Color(0, 0, 255);
	}
	
	public Point getA()
	{
		return a;
	}
	
	public Point getB()
	{
		return b;
	}
	
	public Point getC()
	{
		return c;
	}
	

	
	public boolean checkPossibleToCreate()
	{
		double rateDirectional;
		double intersectionOY;
		rateDirectional = (a.getY()-b.getY()) / (a.getX()-b.getX()); //wsp kierunkowy a
		intersectionOY = a.getY() - (a.getX()*rateDirectional); // przeciecie z osia Y b
		if (c.getY() == rateDirectional*c.getX() + intersectionOY)
			return false;
		else
			return true;
	}
	
	public double countPerimeter()
	{
		return a.Distance(b) + b.Distance(c) + c.Distance(a);
	}
	
	public double countArea()
	{
		double p = countPerimeter()/2;
		return Math.sqrt(p * (p-a.Distance(b)) * (p-b.Distance(c)) * (p-c.Distance(a)));
	}
	
	
	public double countHeight(String witchVertex)
	{
		if (witchVertex == "a" || witchVertex=="A")
			return 2*countArea() / b.Distance(c);
		else if (witchVertex == "b" || witchVertex=="B")
			return 2*countArea() / c.Distance(a);
		else if (witchVertex == "c" || witchVertex=="C")
			return 2*countArea() / a.Distance(b);
		else return -1;
	}
	
	public void changleVertex(Point vertex, int x, int y)
	{
		vertex.setX(x);
		vertex.setY(y);
	}
	
	public boolean contains(Point p)
	{
		double d1 = p.getX()*(a.getY()-b.getY()) + p.getY()*(b.getX()-a.getX()) + (a.getX()*b.getY()-a.getY()*b.getX());
        double d2 = p.getX()*(b.getY()-c.getY()) + p.getY()*(c.getX()-b.getX()) + (b.getX()*c.getY()-b.getY()*c.getX());
        double d3 = p.getX()*(c.getY()-a.getY()) + p.getY()*(a.getX()-c.getX()) + (c.getX()*a.getY()-c.getY()*a.getX());
		if((d1<=0 && d2<=0 && d3<=0) || (d1>=0 && d2>=0 && d3>=0)) return true;
		return false;
	}
	
	public void drawFigure(Graphics draw)
	{
		int [] PointX = { (int)a.getX(), (int)b.getX(), (int)c.getX() };
		int [] PointY = { (int)a.getY(), (int)b.getY(), (int)c.getY() };
		draw.setColor(FigureColor);
		draw.drawPolygon(PointX, PointY, 3);
		draw.fillPolygon(PointX, PointY, 3);
	}
	
	public String toString()
	{
		String result;
		result = "Triangle: [" + a.getX() + "," + a.getY() + "]  ";
		result += "[" + b.getX() + "," + b.getY() + "]  ";
		result+= "[" + c.getX() + "," + c.getY() + "]";
		return result;
	}

}
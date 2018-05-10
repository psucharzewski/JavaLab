package packk;

public class Point 
{
	private double x;
	private double y;
	
	public Point(double x, double y)
	{
		this.x = x;
		this.y = y;
	}
	
	public double getX()
	{
		return x;
	}
	
	public double getY()
	{
		return y;
	}
	
	public void setX(double x)
	{
		this.x = x;
	}
	
	public void setY(double y)
	{
		this.y = y;
	}
	
	public void updateX(double v)
	{
		this.x += v;
	}
	
	public void updateY(double v)
	{
		this.y += v;
	}
	
	public double Distance(Point b)
	{
		return Math.sqrt((b.x-x)*(b.x-x) + (b.y-y)*(b.y-y));
	}
	
	public String toString()
	{
		String result;
		result = "["+x+","+y+"]";
		return result;
	}
}

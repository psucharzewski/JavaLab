package lab4;


public class Point {
	private int x;
	private int y;
	
	public Point(int x1, int y1)
	{
		this.x = x1;
		this.y = y1;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public double discance(Point point_ref)
	{
		double summary=0;
		summary = Math.pow((point_ref.getX() - this.x),2) + Math.pow((point_ref.getY() - this.y), 2);
		return Math.sqrt(summary);
	}
	/*
	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
	@Override
	public String toString()
	{
		return "( " + x + ", " + y + " )";
	}*/
}

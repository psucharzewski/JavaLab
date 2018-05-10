package labki3_1;


import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Polygon;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;

public class Square  
{
		HashMap<Integer, Color> colorMap;
		//Fields
		private Point[] p;
		private Color col;
		
		//Constructors
		public Square()
		{
			colorMap = new HashMap<>();
			colorMap.put(0, Color.RED);
			colorMap.put(1, Color.YELLOW);
			colorMap.put(2, Color.GREEN);
			colorMap.put(3, Color.BLACK);
			colorMap.put(4, Color.MAGENTA);
			colorMap.put(5, Color.CYAN);
			Random generator = new Random();
			col = colorMap.get(generator.nextInt(6));
		}
		
		public Square(int x)
		{
			this();
			p = new Point[4];
			p[0] = new Point(x, 0);
			p[1] = new Point(x + 20, 0);
			p[2] = new Point(x + 20, 20);
			p[3] = new Point(x, 20);
		}
		
		public Square(Point p1)
		{
			this();
			p = new Point[4];
			p[0] = new Point(p1);
			p[1] = new Point((int)p1.getX() + 20, (int)p1.getY());
			p[2] = new Point((int)p1.getX() + 20, (int)p1.getY() + 20);
			p[3] = new Point((int)p1.getX(), (int)p1.getY() + 20);
		}
		
		
		public Square(Square s)
		{
			this(s.p[0]);
		}
		
		//Public methods
		
		public void setP(int i, int x, int y)
		{
			if(i >= this.p.length || i < 0)
			{
				System.out.println("Niepoprawne i");
				return;
			}
			p[i].move(x, y);
		}
		
		public double distance(Point p1, Point p2)
		{
			double x = p1.getX() - p2.getX();
			double y = p1.getY() - p2.getY();
			return Math.sqrt(x*x + y*y);
		}
		
		public void drawFigure(Graphics g, int height, int width)
		{
			int[] x = new int[4];
			int[] y = new int[4];
			for(int i = 0; i < 4; i++)
			{
				x[i] = (int) p[i].getX() + height;
				y[i] = (int) p[i].getY() + width;
			}
			
			g.setColor(col);
			
			g.drawPolygon(x , y, 4);
			g.fillPolygon(x , y, 4);
		}
		
		public int move(int width, int height, Integer speed)
		{
			if(height <= p[2].getY())
			{
				Random generator = new Random();
				int rand = generator.nextInt(width - 10);
				p[0].setLocation(rand, 0);
				p[1].setLocation(rand + 20, 0);
				p[2].setLocation(rand + 20, 20);
				p[3].setLocation(rand, 20);
				return 1 + generator.nextInt(5);
			}
			p[0].setLocation(p[0].getX() , p[0].getY() + speed);
			p[1].setLocation(p[1].getX() , p[1].getY() + speed);
			p[2].setLocation(p[2].getX() , p[2].getY() + speed);
			p[3].setLocation(p[3].getX() , p[3].getY() + speed);
			return speed;
		}
		
		@Override
		public String toString()
		{
			return "{" + p[0] +" " + p[1] + " " + p[2] + p[3] + "}";
		}

}


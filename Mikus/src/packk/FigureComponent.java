package packk;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import javax.swing.JComponent;
import javax.swing.JPanel;


public class FigureComponent extends JComponent
{
	private ArrayList<Triangle> lista = new ArrayList<>();
	private double PressedPointX;
	private double PressedPointY;
	private Triangle tmp;
	
	
	public FigureComponent()
	{
		addMouseListener(new MouseHandler());
	    addMouseMotionListener(new MouseMotionHandler());
	}
	
	public void add(Triangle t)
	{
		lista.add(t);
		repaint();
	}
	
	public void remove(Triangle t)
    {
        lista.remove(t);
        repaint();
    }
	
	public Triangle find(Point point)
	{
		for (int i = lista.size()-1; i>=0; i--)
		{
			if (lista.get(i).contains(point)) 
				return lista.get(i);
		}
		return null;
	}
	
	
	
	public void paintComponent(Graphics draw)
	{	
		for (int i=0; i<lista.size(); i++)
		{
			lista.get(i).drawFigure(draw);
		}
	}
	
	
	
	private class MouseHandler extends MouseAdapter
	{
		private FigureComponent f;
		
		public void mousePressed(MouseEvent ev) 
		{
			double x = ev.getX();
			double y = ev.getY();
			tmp = find(new Point(x,y));
			if(find(new Point(x,y))==null)
            {
               add(new Triangle(new Point(x, y), new Point(x-75, y+75), new Point(x+75, y+75)));
            }
			PressedPointX = x;
			PressedPointY = y;
		}
		
		public void mouseClicked(MouseEvent ev)
		{
			double x = ev.getX();
			double y = ev.getY();
			if (find(new Point(x,y)) != null && ev.getClickCount() == 2) 
				remove(find(new Point(x,y)));
		}
		
	}
	
	private class MouseMotionHandler implements MouseMotionListener
	{
		private FigureComponent f;

		public void mouseDragged(MouseEvent ev) 
		{
			//tmp = find(new Point(PressedPointX,PressedPointY));
			if (tmp != null) 
			{
				double x = ev.getX();
				double y = ev.getY();
				double x1 = x - PressedPointX;
				double y1 = y - PressedPointY;
				PressedPointX = x;
				PressedPointY = y;
				tmp.getA().updateX(x1);
				tmp.getA().updateY(y1);
				tmp.getB().updateX(x1);
				tmp.getB().updateY(y1);
				tmp.getC().updateX(x1);
				tmp.getC().updateY(y1);
				repaint();
			}
		}


		public void mouseMoved(MouseEvent ev) 
		{
			double x = ev.getX();
			double y = ev.getY();
			if (find(new Point(x,y)) == null) 
				setCursor(Cursor.getDefaultCursor());
			else 
				setCursor(Cursor.getPredefinedCursor(Cursor.CROSSHAIR_CURSOR));
		}
		
	}
}
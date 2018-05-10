package lab4;

import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;


import javax.swing.JComponent;


public class FigureComponent extends JComponent
{

	private ArrayList<Triangle> lista = new ArrayList<>();
	private int PressedPointX;
	private int PressedPointY;
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
		lista.get(i).draw(draw);
	}
}



private class MouseHandler extends MouseAdapter
{

	
	public void mousePressed(MouseEvent ev) 
	{
		int x = ev.getX();
		int y = ev.getY();
		tmp = find(new Point(x,y));
		if(find(new Point(x,y))==null)
        {
           add(new Triangle(x, y,x-60, y+60, x+90, y+90));
        }
		PressedPointX = x;
		PressedPointY = y;
	}
	
	public void mouseClicked(MouseEvent ev)
	{
		int x = ev.getX();
		int y = ev.getY();
		if (find(new Point(x,y)) != null && ev.getClickCount() == 2) 
			remove(find(new Point(x,y)));
	}
	
}

private class MouseMotionHandler implements MouseMotionListener
{


	public void mouseDragged(MouseEvent ev) 
	{
		if (tmp != null) 
		{
			int x = ev.getX();
			int y = ev.getY();
			int x1 = x - PressedPointX;
			int y1 = y - PressedPointY;
			PressedPointX = x;
			PressedPointY = y;
			tmp.getPointA().updateX(x1);
			tmp.getPointA().updateY(y1);
			tmp.getPointB().updateX(x1);
			tmp.getPointB().updateY(y1);
			tmp.getPointC().updateX(x1);
			tmp.getPointC().updateY(y1);
			repaint();
		}
	}


	public void mouseMoved(MouseEvent ev) 
	{
		int x = ev.getX();
		int y = ev.getY();
		if (find(new Point(x,y)) == null) 
			setCursor(Cursor.getDefaultCursor());
		else 
			setCursor(Cursor.getPredefinedCursor(Cursor.CROSSHAIR_CURSOR));
	}
	
}
}

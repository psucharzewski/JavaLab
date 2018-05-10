package lab4;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public abstract class Polygon extends JPanel implements Figure {
public Color myColor;
static public int theNumberOfTheBeast;
public void setColor(int i)
{
	if(i== 1) this.myColor = new Color(150,130,210);
	else this.myColor = new Color(60,20,30);
}
public abstract double countPermiter();
public abstract double countArea();
public abstract void draw(Graphics graph);
public static int getTheNumberOfTheBeast() {
	return theNumberOfTheBeast;
}
public static void setTheNumberOfTheBeast(int theNumberOfTheBeast) {
	Polygon.theNumberOfTheBeast = theNumberOfTheBeast;
}

}

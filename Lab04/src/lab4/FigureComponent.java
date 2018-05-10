package lab4;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.JPanel;

public class FigureComponent extends JPanel {

	public void paintComponent(Graphics graph)
	{
		Triangle t1 = new Triangle(150, 10,232, 145,300, 100);
		Triangle t2 = new Triangle(600, 100,700, 250,655, 20);
		
		Quadrangle q1 = new Quadrangle(50, 50,150, 100,222, 345,200, 400);
		Quadrangle q2 = new Quadrangle(300, 300,360, 400,400, 350,385,250);
		
		Polygon tab[] = new Polygon[4];
		tab[0] = t1;
		tab[1] = q1;
		tab[2] = t2;
		tab[3] = q2;
		
		System.out.println("the array");
		for (int i=0; i<tab.length; i++)
		{
			tab[i].draw(graph);
			System.out.println("The number of Polygon is " + i + "the area " + tab[i].countArea() );
			System.out.println("the Permiter " + tab[i].countPermiter());
		}
		
		
		List<Figure> lista = new ArrayList<Figure>();
		lista.add(t1);
		lista.add(q1);
		lista.add(t2);
		lista.add(q2);
		
		System.out.print("\n\n\n");
		for (int i=0; i<lista.size(); i++)
		{
			lista.get(i).draw(graph);
			System.out.println("The number of Figure is " + i + "the area " + lista.get(i).countArea() );
			System.out.println("the Permiter " + lista.get(i).countPermiter());
		}

		
		
		System.out.println("the number of Figures: " + Polygon.getTheNumberOfTheBeast());

	}
	
}

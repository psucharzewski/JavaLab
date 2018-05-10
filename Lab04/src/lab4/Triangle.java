package lab4;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.*;

public class Triangle extends Polygon {
		private Point pointA;
		private Point pointB;
		private Point pointC;
		public Triangle(int x_a, int y_a, int x_b, int y_b, int x_c, int y_c)
		{
			this.pointA = new Point(x_a,y_a);
			this.pointB = new Point(x_b,y_b);
			this.pointC = new Point(x_c,y_c);
			Polygon.theNumberOfTheBeast++;
		}
		@Override
		public void draw(Graphics graph)
		{
		    int xpoints[] = {pointA.getX(),pointB.getX(),pointC.getX()};
		    int ypoints[] = {pointA.getY(),pointB.getY(),pointC.getY()};
		    int npoints = 3;
		    this.setColor(1);
		    graph.setColor(myColor);
		    graph.drawPolygon(xpoints, ypoints, npoints);
		    graph.fillPolygon(xpoints, ypoints, npoints);
		}
		@Override
		public double countPermiter()
		{
			return pointA.discance(pointB) + pointB.discance(pointC) + pointC.discance(pointA);
		}
		@Override
		public double countArea()
		{
			double summary,help=0.5;
			double h_c=0;
			double h_c1 = this.countPermiter();
			h_c= h_c1 * help;
			summary = (h_c*(h_c - pointA.discance(pointB))*(h_c - pointB.discance(pointC))*(h_c - pointC.discance(pointA)));
			return Math.sqrt(summary);
		}
		public double high_Triangle(int witch_one)
		{
			if(witch_one == 1) return (((countArea()*2))/(pointB.discance(pointC)));
			if(witch_one == 2) return ((countArea()*2)/pointC.discance(pointA));
			if(witch_one == 3) return ((countArea()*2)/pointA.discance(pointB));
			else return 0;
		}/*
		public void changeCoordinateX(double x)
		{
			this.pointA.setX(x);
		}
		public void changeCoordinateY(double y)
		{
			this.pointA.setY(y);
		}
		
		public void changeCoordinateXB(double x)
		{
			this.pointB.setX(x);
		}
		public void changeCoordinateYB(double y)
		{
			this.pointB.setY(y);
		}
		
		public void changeCoordinateXC(double x)
		{
			this.pointC.setX(x);
		}
		public void changeCoordinateYC(double y)
		{
			this.pointC.setY(y);
		}*/
		
		public Point getPointA() {
			return pointA;
		}

		public void setPointA(Point pointA) {
			this.pointA = pointA;
		}

		public Point getPointB() {
			return pointB;
		}

		public void setPointB(Point pointB) {
			this.pointB = pointB;
		}

		public Point getPointC() {
			return pointC;
		}

		public void setPointC(Point pointC) {
			this.pointC = pointC;
		}
		
		@Override 
		public String toString()
		{
			return pointA.toString() + pointB.toString() + pointC.toString();
		}
	}



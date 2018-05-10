package labki8;

import java.util.Scanner;
import java.util.Random;


public class Vector {
	  private double a[];
	  private int size;
	  
	    public Vector(int size)
	    {
	    	Random generator = new Random();
	    	this.size = size;
	        int ii;
	        this.a = new double[this.size];
	        for(ii=0; ii<this.size; ii++)
	        {

	        	this.a[ii] = Math.round(generator.nextDouble()*100);
	        }
	    }
	  

	  
	  public Vector(Vector vector)
	  {
		  this.a = new double[vector.getSize()];
		  this.size= vector.getSize();
	  }
	  public Vector(double[] b, int i)
	  {
		  this.a = b;
		  this.size = i;
	  }

	public double[] getA() {
		return a;
	}

	public int getSize() {
		return size;
	}
	
	public double getElementOfArray(int element)
	{
		return a[element];
	}
	
	public void setElementOfArrayCurrentValue(int element, double value)
	{
		this.a[element]=value;
	}
	
	public void setA(double[] a) {
		this.a = a;
	}
	
	public void setSize(int size) {
		this.size = size;
	}

	public boolean ifEqual(Vector b)
	{
		if( size == b.getSize()) return true;
		else return false;
	}
	public boolean ifEqualVectorVsMatrix(Matrix matrix)
	{
		if(this.size == matrix.getSize()) return true;
		else return false;
	}
	
	public void addTwoVector(Vector vector1, Vector vector2)
	{
		int i;
		i = vector1.getSize();
		size = i;
		for(i=0;i<vector1.getSize();i++)
		{
			this.a[i] = vector1.getElementOfArray(i) +vector2.getElementOfArray(i);
		}
	}
	public void MultiplayMatrixAndVector(Matrix matrix, Vector vector)
	{
		int i=0,j=0;
		this.size = matrix.getSize();
		for(i=0;i<this.size;i++)
		{
			for(j=0;j<this.size;j++)
			{
				this.a[i]= this.a[i] + matrix.getElementOfArray(i, j)*vector.getElementOfArray(i);
			}
		}
	}
	public void MultiplayMatrixAndVectorOneRow(Matrix matrix, Vector vector,int from,int to )
	{

		for(int i = from; i < to; ++i) {
            double s = 0;
            for(int j = 0; j < vector.getSize(); ++j)
                s += matrix.getElementOfArray(i, j) * vector.getElementOfArray(j);
            this.setElementOfArrayCurrentValue(i, s);
        }
	}
	public double scallar(Vector a)
	{
		int i;
		double result=0;
		i = a.getSize();
		this.size = i;
		for(i=0;i<a.getSize();i++)
		{
			result = result + this.a[i]*a.getElementOfArray(i);
		}
		return result;
	}
	public void show()
	{
		System.out.print("[");
		for (int i = 0; i < this.size; i++)
		{
			System.out.print(this.a[i] + "\t");
		}
		System.out.println("]");
	}
}
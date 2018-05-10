package lab2;
import java.util.Scanner;

public class Vector {
	  private double a[];
	  private int size;
	  
	    public Vector()
	    {
	        Scanner s = new Scanner(System.in);
	        System.out.println("Podaj wielkosc wektora ");
	        this.size= s.nextInt();
	        int ii;
	        this.a = new double[this.size];
	        for(ii=0; ii<this.size; ii++)
	        {

	                System.out.println("podaj wartosc komorki ["+ii +"]");
	                this.a[ii] = s.nextDouble();

	        }
	        s.close();
	    }
	  
	  public Vector(int in)
	  {
	  this.a = new double[in];
	  this.size = in;
	  }
	  
	  public Vector(Vector a, int in)
	  {
		  this.a = new double[in];
		  this.a = a.getA();
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
	
}


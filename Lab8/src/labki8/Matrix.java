package labki8;

import java.math.*;
import java.util.Random;


public class Matrix {

	 private double a[][];
	    private int size;
	    
	    public Matrix()
	    {
	    	this.size = 3;
	    	this.a = new double[this.size][this.size];
	    }
	    
	    public Matrix(int in)
	    {
	        Random generator = new Random();
	    	this.size= in;
	        int ii,j;
	        this.a = new double[this.size][this.size];
	        for(ii=0; ii<this.size; ii++)
	        {
	            for(j=0;j<this.size;j++)
	            {
	                this.a[ii][j] = Math.round(generator.nextDouble()*100);
	                
	            }

	        }
	    }

	    public boolean ifEqual(Matrix matrix)
	    {
	    	if(this.size== matrix.getSize()) return true;
	    	else return false;
	    }
	    
		public double getElementOfArray(int elementX, int elementY)
		{
			return a[elementX][elementY];
		}
		
		public void setElementOfArrayCurrentValue(int elementX,int elementY, double value)
		{
			this.a[elementX][elementY]=value;
		}

		public void AddTwoMatrixs(Matrix matrix1,Matrix matrix2)
		{
	        int i,j;
	        this.size = matrix1.getSize();
			for(i=0; i<this.size; i++)
	        {
	            for(j=0;j<this.size;j++)
	            {
	                this.a[i][j] = matrix1.getElementOfArray(i, j) + matrix1.getElementOfArray(i, j);
	            }

	        }
		}
		public double[][] getA() {
			return a;
		}



		public void setA(double[][] a) {
			this.a = a;
		}



		public int getSize() {
			return size;
		}



		public void setSize(int size) {
			this.size = size;
		}
	    
	    @Override 
	    public String toString()
	    {	
	    	
	    	String aString= " ";
	    	for (int i = 0; i < this.size; i++)
	    	{
	    		aString += "[";
	    		for (int j = 0; j < this.size; j++)
	    			aString+=this.a[i][j] +"\t";
	    		aString+="]\n";
	    	}
	    	return aString;
	    }	
}
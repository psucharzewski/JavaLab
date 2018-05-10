package lab2;

import java.util.Arrays;

public class Calculations {

	public static void main(String[] args) {
		
		double[] array1 = new double[3];
		double[] array2 = new double[3];
		double[] array3 = new double[4];
		array1[0] = -3;
		array1[1] = 4;
		array1[2] = 2;
		Vector vectorNr1 = new Vector(array1,3);

		array2[0] = 5;
		array2[1] = -1;
		array2[2] = 4;
		Vector vectorNr2 = new Vector(array2,3);
		array3[0] = 5;
		array3[1] = -1;
		array3[2] = 4;
		array3[3] = 2;
		Vector vectorNr3 = new Vector(array3,4);
		System.out.println("Vector nr 1" + Arrays.toString(vectorNr1.getA()));
		System.out.println("Vector nr 2" + Arrays.toString(vectorNr2.getA()));
		System.out.println("Vector nr 3" + Arrays.toString(vectorNr3.getA()));

		if(vectorNr1.ifEqual(vectorNr2))
		{
			Vector vectorNr4 = new Vector(vectorNr1.getSize());
			vectorNr3.addTwoVector(vectorNr1, vectorNr2);
			System.out.println(Arrays.toString(vectorNr3.getA()));
		}
		else
		{
			System.out.println("Nie mozna dodac wektorow poniewaz sa one nie rowne");
		}
		
		if(vectorNr1.ifEqual(vectorNr3))
		{
			Vector vectorNr4 = new Vector(vectorNr1.getSize());
			vectorNr3.addTwoVector(vectorNr1, vectorNr2);
			System.out.println(Arrays.toString(vectorNr3.getA()));
		}
		else
		{
			System.out.println("Nie mozna dodac wektorow poniewaz sa one nie rowne");
		}
		
		if(vectorNr1.ifEqual(vectorNr2))
		{
			System.out.println("Iloczyn skalarny wektorow wynosi " +vectorNr1.scallar(vectorNr2));	
		}
		else{
			System.out.println("Nie mozna pomnozyc wektorow skalarnie poniewaz sa one nie rowne");
		}
		Matrix matrix1 = new Matrix(3);
		Matrix matrix2 = new Matrix(3);
		Matrix matrix3 = new Matrix(4);
		Matrix matrix4 = new Matrix();
		System.out.println("Matrix nr 1" + matrix1);
		System.out.println("Matrix nr 2" + matrix2);
		System.out.println("Matrix nr 3" + matrix3);
		if(vectorNr1.ifEqualVectorVsMatrix(matrix1))
		{
			vectorNr2.MultiplayMatrixAndVector(matrix1, vectorNr1);
			System.out.println("Wynik mnozenia macierzy przez wektor" + Arrays.toString(vectorNr2.getA()));
		}
		else;
		{
			System.out.println("Macierz i wektor nie sa rowne");
		}
		
		if(matrix1.ifEqual(matrix2))
		{
			matrix4.AddTwoMatrixs(matrix1, matrix2);
			System.out.println("wynik dodawania macierz nr 1 oraz nr 2" + matrix4);
		}
		else;
		{
			System.out.println("Macierze nie sa rowne");
		}
	}

}

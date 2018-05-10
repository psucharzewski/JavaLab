import java.util.Scanner;
public class SolveEquation {

	public static void main(String[] args) {
		System.out.println("Prosze podaj wartosci rownania");
		System.out.println("Podaj wspolczynnik a");
		float a; 
		Scanner in = new Scanner(System.in);
		a=in.nextFloat();
		System.out.println("Podaj b");
		float b;
		b=in.nextFloat();
		System.out.println("podaj c");
		float c;
		c = in.nextFloat();
		//Polynomial w1 = new Polynomial(a,b,c);
		if (a == 0) 
		{
		Polynomial w1 = new Polynomial(b,c);
		System.out.println(w1);
		w1.solve();
		w1.count_min();
		w1.show();

		}
		else 
		{
			Polynomial w1 = new Polynomial(a,b,c);
			System.out.println(w1);
			w1.solve();
			w1.count_min();
			w1.show();

		}

		in.close();
		//Polynomial r1= new Polynomial(4,5,3);
		
	}

}

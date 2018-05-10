public class Polynomial 
{

	
	private float a;
	private float b;
	private float c;

	private Solution Equ ;
	
	public void solve()
	{
		float delta;
		delta = (b*b) -4*a*c;
		if ( a==0 )
		{
			Equ.setX0((-c/b));
			Equ.setType(1);
		}
		else if(a==0 && b== 0)
		{
			Equ.setType(0);
			System.out.println("rownanie sprzeczne");
		}
		if(delta>0)
		{
			double sq =Math.sqrt(delta);
			float x1=(-b - (float)sq)/(2*a);
			float x2=(-b + (float)sq)/(2*a);
			Equ.setX1(x1);
			Equ.setX2(x2);
			Equ.setType(2);
		}
		
		if(delta==0)
		{
			float x0 = -b/2*a;
			Equ.setX0(x0);
			Equ.setType(1);
		}
		if(delta<0)
		{	
			double sq =Math.sqrt(delta);
			sq = -sq;
			float x1=(-b - (float)sq)/(2*a);
			float x2=(-b + (float)sq)/(2*a);
			Equ.setX1(x1);
			Equ.setX2(x2);
			Equ.setType(3);
		}
	}
	public Polynomial(float b, float c)
	{
		this.a= 0;
		this.b =b;
		this.c = c;
		this.Equ = new Solution();
	}
	public float count_value(float x)
	{
		float value = a*x*x + b*x + c;
		return value;
	}
	public void count_min()
	{
		if ( Equ.getType()==1)
		{
			float x = count_value(Equ.getX0());
			if(a > 0) System.out.format("Wartosc min wynosi ( %f,%f )",Equ.getX0(),x);
			if(a < 0)  System.out.format("Wartosc max wynosi ( %f,%f ",Equ.getX0(),x);
		}
		else if(Equ.getType()==2)
		{
			float x = (Equ.getX1()+ Equ.getX2())/ 2;
			if (a > 0) System.out.format("Wartosc min wynosi ( %f,%f ",x,count_value(x));
			if (a<0) System.out.format("Wartosc max wynosi ( %f,%f ",x,count_value(x));
		}else System.out.println("Brak min oraz max w zbiorze liczb rzeczywistych");
		
	}
	public void show()
	{	
		if(Equ.getType()==0) System.out.println("Brak rozwiazan rzeczywistych");
		else if(Equ.getType()==1)
		{
		System.out.println("Rownanie posiada jedno rozwiazanie x0 = " + Equ.getX0()+ " )");
		}
		else if(Equ.getType()==2) {
			System.out.println("Rownanie posiada dwa rozwiazania x1 = " + Equ.getX1()+ " x2 =" + Equ.getX2() + " )");
		}
		else if(Equ.getType()==3)
		{
			System.out.println("Rownanie posiada dwa rozwiazania urojone x1 = " + Equ.getX1()+ "i x2 =" + Equ.getX2() + "i )");
		}
	}
	public Polynomial(float a, float b, float c) 
	{
		this.a = a;
		this.b = b;
		this.c = c;
		this.Equ = new Solution();
	}


	@Override
	public String toString() {
		return "Polynomial x^2*" + a + " + x*"+ b + " + "+ c + " = 0";
	}


}

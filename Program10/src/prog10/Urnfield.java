package prog10;

public class Urnfield {
	public String fromArabic(int number)
	{
		if(number>29) throw new IllegalArgumentException();
		String stringNumber="";
		
		if((number/5)!=0){
			for(int i=0;i<(number/5);i++)
			{
				stringNumber +="\\";
			}
		}
		number = number - (number/5)*5;
		
		if((number/1)!=0){
			for(int i=0;i<(number/1);i++)
			{
				stringNumber ="/" + stringNumber;
			}
		}
		return stringNumber;
	}

	public int toArabic(String number)
	{
		int sum=0;
		for(int i=0;i<number.length();i++)
		{
			switch (number.charAt(i)){
				case '\\':
					sum+=5;
					break;
				case '/':
					sum+=1;
					break;
			}
		}
		
		return sum;
	}
}

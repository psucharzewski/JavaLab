package prog10;

public class Roman {

public String fromArabic(int number)
{
	if(number>3000) throw new IllegalArgumentException();
	String stringNumber="";
	if((number/1000)!=0){
		for(int i=0;i<(number/1000);i++)
		{
			stringNumber +="M";
		}
	}
	number = number - (number/1000)*1000;
	
	if((number/500)!=0){
		for(int i=0;i<(number/500);i++)
		{
			stringNumber +="D";
		}
	}
	number = number - (number/500)*500;
	
	if((number/100)!=0){
		for(int i=0;i<(number/100);i++)
		{
			stringNumber +="C";
		}
	}
	number = number - (number/100)*100;
	
	if((number/50)!=0){
		for(int i=0;i<(number/50);i++)
		{
			stringNumber +="L";
		}
	}
	number = number - (number/50)*50;
	
	if((number/10)!=0){
		for(int i=0;i<(number/10);i++)
		{
			stringNumber +="X";
		}
	}
	number = number - (number/10)*10;
	
	if((number/5)!=0){
		for(int i=0;i<(number/5);i++)
		{
			stringNumber +="V";
		}
	}
	number = number - (number/5)*5;
	
	if((number/1)!=0){
		for(int i=0;i<(number/1);i++)
		{
			stringNumber +="I";
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
			case 'M':
				sum+=1000;
				break;
			case 'D':
				sum+=500;
				break;
			case 'C':
				sum+=100;
				break;
			case 'L':
				sum+=50;
				break;
			case 'X':
				sum+=10;
				break;
			case 'V':
				sum+=5;
				break;
			case 'I':
				sum+=1;
				break;
		}
	}
	
	return sum;
}
}

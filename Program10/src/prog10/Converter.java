package prog10;

public class Converter {

public String convert(Arabic arabic1,Arabic arabic2,String number)
{
	return number;
}
public String convert(Roman arabic1,Roman arabic2,String number)
{
	return number;
}
public String convert(Urnfield arabic1,Urnfield arabic2,String number)
{
	return number;
}

public String convert(Arabic arabic,Roman roman,String number)
{
	return roman.fromArabic(Integer.parseInt(number));
}

public String convert(Arabic arabic,Urnfield urnfield,String number)
{
	return urnfield.fromArabic(Integer.parseInt(number));
}
public String convert(Roman roman,Arabic arabic,String number)
{
	return String.valueOf(roman.toArabic(number));
}

public String convert(Urnfield urnfield,Arabic arabic,String number)
{
	return String.valueOf(urnfield.toArabic(number));
}
public String convert(Roman roman,Urnfield urnfield,String number)
{
	return urnfield.fromArabic(roman.toArabic(number));
}

public String convert(Urnfield urnfield,Roman roman,String number)
{
	return roman.fromArabic(urnfield.toArabic(number));
}
}

package Lab7_cal;

import java.util.Stack;
import java.util.StringTokenizer;

public class ReversPolishNotacion {
private String pre;
private String post;
private double result;
public ReversPolishNotacion(String formula)
{
	  pre = formula;
	  post = "";

	  result = 0.0;
	  if(!brackets())
	   post = "Niepoprawne nawiasy w wyra¿eniu infiksowym";
	  else {
	   formula();
	   result = count();}
}

private boolean brackets() {
	  Stack<String> stos = new Stack<String>();

	  // dzielimy wyra¿enie infiksowe na czêœci na podstawie separatorów
	  StringTokenizer st = new StringTokenizer(pre, "()", true);
	        
	  while(st.hasMoreTokens()) {
	   String s = st.nextToken();
	            
	   if(s.equals("(")) stos.push(s);
	   // je¿eli znak jest nawiasem zamykaj¹cym porównujemy go z wartoœci¹ ze stosu            
	   if(s.equals(")")) {
	    if (stos.isEmpty()) return false;
	    if (!stos.pop().equals("(")) return false;
	   }
	  }
	  return stos.isEmpty();         
	 }

private void formula() {
       
 Stack<String> stos = new Stack<String>();
       
 StringTokenizer st = new StringTokenizer(pre, "+-*/()", true);
       
 while(st.hasMoreTokens()) {

  String s = st.nextToken();
        
  if( s.equals("+") || s.equals("*") || s.equals("-") || s.equals("/")) {
   while(!stos.empty() && priorytet(stos.peek()) >= priorytet(s)) 
    post += stos.pop()  + " ";
   stos.push(s);
  }
  else if(s.equals("(")) stos.push(s);
  else if(s.equals(")")) {
   while(!stos.peek().equals("(")) post += stos.pop() + " ";
   stos.pop();
  }
  else post += s  + " ";
 }
 while(!stos.empty()) post += stos.pop()  + " ";
} 
 
public static int priorytet(String operator) {
 if(operator.equals("+") || operator.equals("-")) return 1;
 else if(operator.equals("*") || operator.equals("/")) return 2;
 else return 0;
}

private double count() {
	  
	  Stack<Double> stos = new Stack<Double>();
	        
	  StringTokenizer st = new StringTokenizer(post, " ");
	        
	  while(st.hasMoreTokens()) {

	   String s = st.nextToken();
	  
	   if (!s.equals("+") && !s.equals("*") && !s.equals("-") && !s.equals("/")) {
	    double value = Double.parseDouble(s);
	    stos.push(value);
	   }
	   else {
	    double value1 = stos.pop();
	    double value2 = stos.pop();
	    switch(s.charAt(0)) {
	     case '*': {stos.push(value2 * value1); break;}
	     case '+': {stos.push(value2 + value1); break;}
	     case '-': {stos.push(value2 - value1); break;}
	     case '/': {stos.push(value2 / value1); break;}
	    }
	   }
	  }
	  return stos.pop();
	 }
public String toString() {
 return post + "wynik : "+ result;
}

public double getResult()
{
	return result;
}
}


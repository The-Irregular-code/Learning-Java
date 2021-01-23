/* Try catch */

import java.util.Scanner; 

public class trycatch
{
 public static void main(String[] args) 
{
  Scanner in = new Scanner(System.in);
  
  System.out.println("Enter two numbers to calculate: ");

  double result;  
  double a= in.nextDouble();
  double b=in.nextDouble(); 
 
	try{
	        result = a + b;
	        System.out.println("a + b = " + result);
    	
	        result = a - b;
	        System.out.println("a - b = " + result);

	        result = a * b;
	        System.out.println("a * b = " + result);

	        result = a % b;
  	        System.out.println("a % b = " + result);

	    if (b != 0){
	        result = a / b;
  	        System.out.println("a / b = " + result); 
	    }
	else{
           throw new ArithmeticException();
	    }
	 }
	catch(ArithmeticException  e){
	    System.out.println(e + " \nYou entered 0");
	 }
	

 }
}
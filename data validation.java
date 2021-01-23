/* Write a pure class for data validation. Use this class to validate user input.*/

import java.util.Scanner;

public class validation{
	
        Scanner inp= new Scanner(System.in);

	public static double getDouble(Scanner inp,String index){
	System.out.println(index);

	while(true){
		if(inp.hasNextDouble()){
		return inp.nextDouble();
		}
		else{
		inp.nextLine();
		System.out.println("Not a Double Enter Double: ");
		}
	}		
	}


	public static int getInt(Scanner inp,String index){
	System.out.println(index);

	while(true){
		if(inp.hasNextInt()){
		return inp.nextInt();
		}
		else{
		inp.nextLine();
		System.out.println("Not a Integer Enter Integer: ");
		}
	}		
	}
}

//data
import java.util.Scanner;

public class data
{
    
	public static void main(String[] args)
{
        Scanner inp= new Scanner(System.in);

        System.out.println("Type the serial numbers to execute the operations");
        System.out.println("1. Arithmetic Operations");
        System.out.println("2. Swapping");
        System.out.println("3. Ternary");
        System.out.println("4. Discount");
	System.out.println("5. Marks");
	System.out.println("6. Tax");

	double a,b,c,d;
	int choose;	    
	choose= validation.getInt(inp,"");    
	switch (choose)
{
        case 1:
		System.out.println("Enter two numbers to calculate: ");
  		a=validation.getDouble(inp,"Enter First Number: ");  
		b=validation.getDouble(inp,"Enter Second Number: ");
  
  		System.out.println("Type\n  0 for sum\n  1 for sub\n  2 for mul\n  3 for div\n  4 for rem operation to do");
		c=0;
  		int  ope= validation.getInt(inp,"");    
		  if(ope==0) 
			c=a+b;
		  else if(ope==1) 
			c=a-b;
		  else if(ope==2) 
			c=a*b;
		  else if(ope==3) 
			c=a/b;
		  else if(ope==4) 
			c=a%b;
		  else 
			System.out.println("invalid symbol so incorrect output");  
		  System.out.println("The " +ope +" of " +a +" and " +b +" is " +c);
		break;	

        case 2:
		double x, y;  
	        Scanner sc = new Scanner(System.in);  
	        System.out.println("Enter the value of X and Y");  
	        x = validation.getDouble(inp,"value of x: ");
        	y = validation.getDouble(inp,"value of y: ");   
		System.out.println("After swapping");  
	 	x = x + y;  
	 	y = x - y;  
		x = x - y;  
		System.out.println("value of x:" + x);  
		System.out.println("value of y:" + y); 
		break;	

        case 3:
	        Scanner s = new Scanner(System.in);
	        System.out.println("Enter all three numbers:");
	        a = validation.getDouble(inp,"value of a: ");
		b = validation.getDouble(inp,"value of b: ");
	        c = validation.getDouble(inp,"value of c: ");
	        d = c > (a > b ? a : b) ? c : ((a > b) ? a : b);
	        System.out.println("Largest Number:"+d);
		break;

        case 4:
		double total;
		double discount;

		a=validation.getDouble(inp,"Enter the price of the item: ");
		b=validation.getDouble(inp,"Enter the quantity of the item: ");
		total=a*b;
		if (total>1000)
			discount=(0.15)*total;
		else
			discount=(0.1)*total;
		c=total-discount;		
		System.out.println("the amount to be payed: "+c);
		break;

        case 5:
		a=validation.getDouble(inp,"Enter the marks of 1st subject: ");
		b=validation.getDouble(inp,"Enter the marks of 2nd subject: ");
		c=validation.getDouble(inp,"Enter the marks of 3rd subject: ");
		d=validation.getDouble(inp,"Enter the marks of 4th subject: ");
		double result=a+b+c+d;
		double agg=result/4;
		if (agg>=80)
			System.out.println("your grade is: E ");
		else if (agg>=60 && agg<80)
			System.out.println("your grade is: A ");
		else if (agg>=50 && agg<60)
			System.out.println("your grade is: B ");
		else if (agg>=30 && agg<50)
			System.out.println("your grade is: C ");
		else
			System.out.println("your grade is: F ");
		System.out.println("The total marks obtain is: "+result);
		System.out.println("the aggregate of 4 subjects is : "+agg);
		break;

        case 6:
		double income=validation.getDouble(inp,"Enter the annual income: ");
		if (income>=500001){
			double tax=(.3)*income;
			System.out.println("Total taxable amount= "+tax);}
		else if (income>=300001 && income<=500000){
			double tax=(.2)*income;
			System.out.println("Total taxable amount= "+tax);}
		else if (income>=150001 && income<=300000){
		double tax=(.1)*income;
			System.out.println("Total taxable amount= "+tax);}
		else
			System.out.println("you don't have to pay tax");
		break;	

       default:
            System.out.println("Illigal Operation");
	break;
	 }
   }


}
/* Use of switch case*/

import java.util.Scanner;

public class Menu
{
    
	public static void main(String[] args)
{
        Scanner inp= new Scanner(System.in);
        
        System.out.println("Enter your selection:");
	System.out.println("1 for Reading 3 numbers.");
	System.out.println("2 for Calculate Total.");
	System.out.println("3 for Calculate Average.");
	System.out.println("4 for Display the Smallest.");
	System.out.println("5 for Display the Largest.");
        
	int choose;
        choose = inp.nextInt();
	double x;
	double y;
	double z;
	double total;
       
	switch (choose)
{
        case 1:
		System.out.println("Enter three numbers");  
        	x = inp.nextDouble();  
        	y = inp.nextDouble();
		z = inp.nextDouble();    
        	System.out.println("The Numbers are: "+x+" , "+y+" and "+z); 
		break;
        case 2:
		System.out.println("Enter three numbers");  
        	x = inp.nextDouble();  
        	y = inp.nextDouble();
		z = inp.nextDouble(); 
		total=x+y+z;   
        	System.out.println("The Total=: "+total);   
		break;   
        case 3:
		System.out.println("Enter three numbers");  
        	x = inp.nextDouble();  
        	y = inp.nextDouble();
		z = inp.nextDouble(); 
		total=x+y+z;
		double avg=total/3;   
        	System.out.println("The Average=: "+avg);   
		break;
        case 4:
		System.out.println("Enter three numbers");  
        	x = inp.nextDouble();  
        	y = inp.nextDouble();
		z = inp.nextDouble(); 
		if(x>y && x>z)
			System.out.println("the largest is: "+x);
		else if(y>z)
			System.out.println("the largest is: "+y);
		else
			System.out.println("the largest is: "+z);
		break;
	case 5:
		System.out.println("Enter three numbers");  
        	x = inp.nextDouble();  
        	y = inp.nextDouble();
		z = inp.nextDouble(); 
		if(x<y && x<z)
			System.out.println("the Smallest is: "+x);
		else if(y<z)
			System.out.println("the Smallest is: "+y);
		else
			System.out.println("the Smallest is: "+z);
		break;
        default:
                System.out.println("Illigal Operation");
		break;
	 }
   }


}
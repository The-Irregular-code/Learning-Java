/* App class*/

import java.util.Scanner;

public class app
{
    
	public static void main(String[] args)
{
        Scanner inp= new Scanner(System.in);
        double l,b,h;


	System.out.println("Enter the value of\n length/edge,\n breadth/base and\n height\nEnter 0 if no value found to input");
	l=inp.nextDouble();
	b=inp.nextDouble();
	h=inp.nextDouble();

	main sc=new main(l,b,h);
	
        System.out.println("1. Area of square");
        System.out.println("2. Area of rectangle");
        System.out.println("3. Area of Triangle");
        System.out.println("4. Area of Cube");
	int choose;	    
	choose=inp.nextInt();     
	switch (choose)
{
        case 1:
        	System.out.println("Area of square is :"+sc.getsq());		
		break;
        case 2:	
       		System.out.println("Area of rectangle"+sc.getrec());  
		break;   
        case 3:
		System.out.println("Area of triangle"+sc.gettri()); 
		break;
        case 4:
		System.out.println("Area of cube"+sc.getcub()); 
		break;
	
        default:
                System.out.println("Illigal Operation");
		break;
	 }
   }


}

/*Pure class*/

public class main{
	double l,b,h;
	
	public main(double l,double b,double h)
	{
		this.l=l;
		this.b=b;
		this.h=h;
	}
	public double getsq()
	{
	double a;
	a=l*l;
	return a;
	}
	public double getrec()
	{
	double a;
	a=l*b;
	return a;
	}
	public double gettri()
	{
	double a;
	double v;
	v=b*h;
	a=v/2;
	return a;
	}
	public double getcub()
	{
	double a;
	double v;
	v=l*l;
	a=6*v;
	return a;
	}
}
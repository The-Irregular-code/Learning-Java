/* Marks or Grades*/

import java.util.Scanner;

public class Marks{

public static void main(String[] args)
{
Scanner in=new Scanner(System.in);

System.out.println("enter the marks of 1st subject ");
double a=in.nextDouble();

System.out.println("enter the marks of 2nd sublect ");
double b=in.nextDouble();

System.out.println("enter the marks of 3rd sublect ");
double c=in.nextDouble();

System.out.println("enter the marks of 4th sublect ");
double d=in.nextDouble();

double total=a+b+c+d;
double agg=total/4;

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

System.out.println("The total marks obtain is: "+total);
System.out.println("the aggregate of 4 subjects is : "+agg);
}
}
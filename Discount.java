/* Discount problem*/

import java.util.Scanner;

public class Discount{

public static void main(String[] args)
{
Scanner in=new Scanner(System.in);
double total;
double discount;
double c;

System.out.println("enter the price of the item: ");
double a=in.nextDouble();
System.out.println("enter the quantity of the item: ");
double b=in.nextDouble();

total=a*b;

if (total>1000)
	discount=(0.15)*total;

else
	discount=(0.1)*total;

c=total-discount;

System.out.println("the amount to be payed: "+c);
}
}
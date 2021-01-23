/*Tax problem*/

import java.util.Scanner;

public class Tax{

public static void main(String[] args)
{
Scanner in=new Scanner(System.in);

System.out.println("enter the annual income ");
double income=in.nextDouble();


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
}
}
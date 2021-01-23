/* Eligibillity problem*/

import java.util.Scanner;

public class Eligibility{

public static void main(String[] args)
{
Scanner in=new Scanner(System.in);

System.out.println("have you took mathematics in 10+2?\n type: y/n");
char c =in.next().charAt(0);


if (c=='y' || c=='Y'){
	System.out.println("enter the graduation percentage: ");
	double grad=in.nextDouble();
	System.out.println("enter the qualifying exam percentage: ");
	double quali=in.nextDouble();
	
	if (grad>50 && quali>70)
		System.out.println("you are eligable");
	else
		System.out.println("you are not eligable inspite of having mathematics");
}

else if (c=='n' || c=='N')
	System.out.println("you are not eligable");
 
else
	System.out.println("invalid choice enter: y/n");
}
}
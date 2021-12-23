package scanner_swing;
import java.util.Scanner;

public class home_work 
{

	public static void main(String[] args)
	{
int a ,b, c, d , e , rate;
Scanner average = new Scanner(System.in);
System.out.println("enter the num of a , b , c , d , e : ");

a = average.nextInt();
b = average.nextInt();
c = average.nextInt();
d = average.nextInt();
e = average.nextInt();

rate = a + b + c + d + e / 5 ;
 
System.out.println(" the rate = " + rate );
		
		
	}

}
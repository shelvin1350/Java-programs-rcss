import java.io.*;
import java.util.Scanner;
class Command
{
	public static void main(String args[])
	{
		int a, b;
		
		Scanner d;
		d=new Scanner(System.in);
		try
		{
			System.out.println("Enter two numbers to find the products: ");
			a=d.nextInt();
			b=d.nextInt();
			System.out.println("Product is "+(a*b));
		}
		catch(Exception e)
		{
			
		}
	}
}
		
			
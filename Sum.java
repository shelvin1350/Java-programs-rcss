import java.io.*;
class Sum
{
	public static void main(String args[])
	{
		DataInputStream d;
		d= new DataInputStream(System.in);
		try
		{
			System.out.println("Enter two numbers for sum: ");
			int a=Integer.parseInt(d.readLine());
            int b=Integer.parseInt(d.readLine());
            System.out.println("The sum of "+a+" and "+b+" is "+(a+b));
        }catch(Exception e)
        {
            System.out.println(e);
        }
    }
}



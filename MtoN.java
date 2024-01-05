import java.util.Scanner;
public class MtoN {
    public static void main(String args[])
    {
        int m, n, i;
        System.out.println("Enter the starting(m): ");
        try{
            Scanner s=new Scanner(System.in);
            m=s.nextInt();
            System.out.println("Enter the end(n):");
            n=s.nextInt();
            i=m;
            while(i<=n)
            {
                System.out.println(i);
                i++;
            }

        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}

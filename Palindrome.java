import java.util.*; 
import java.io.*;
class Pal{
    int rev;
    int rem;
    try
    {
        public int insert()
        {
            int a;
            Scanner s= new Scanner(System.in);
            System.out.println("Enter a number to check whether it is a palindrome: ");
            a=s.nextInt();
            return a;
        }
        public int reverse(int a)
        {
            while(a!=0)
            {
                rem=a % 10;
                rev=rev * 10 + rem;
                a= a/10;
            }
            return rev;
        }
        public int palCheck(int a, int rev)
        {
            if(a==rev)
            {
                return 1;
            }
            else{
                return 0;
            }
        }
    }
    catch(Exception e)
    {
        System.out.println(e);
    }

}
public class Palindrome {
    public static void main(String args[])
    {
       int a, rev, result;
       Pal p=new Pal();
       a = p.insert();
       rev = p.reverse(a);
       result=p.palCheck(a, rev);
        if(result==1)
        {
            System.out.println("The number is a palindrome.");
        }
        else{
            System.out.println("The number not a palindrome.");
            
        }
    }
}

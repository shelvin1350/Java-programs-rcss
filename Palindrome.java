import java.io.*;
import java.util.*;
class Pal{
    int a, rev, rem; 
    void input()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number to be checked: ");
        a=s.nextInt();
    }
    int palCheck()
    {
        
        int temp=a;
        while(temp!=0)
        {
            rem=temp%10;
            rev=rev*10+rem;
            temp=temp/10;
        }
        return rev;
    }
}
public class Palindrome {
    public static void main(String args[])
    {
        Pal p = new Pal();
        p.input();
        int r=p.palCheck();
        if(p.a==r)
        {
            System.out.println("The element is a palindrome.");
        }
        else
        {
            System.out.println("The element is not palindome");
        }
    }
}

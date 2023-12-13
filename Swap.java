import java.io.*;
public class Swap {
    public static void main(String args[]){

        try{
            System.out.println("Enter two numbers: ");
            DataInputStream d=new DataInputStream(System.in);
            int a=Integer.parseInt(d.readLine());
            int b=Integer.parseInt(d.readLine());
            int temp;
            System.out.println("Before swapping: a = "+a+"and b = "+b);
            temp=a;
            a=b;
            b=temp;
            System.out.println("After swapping: a = "+a+"and b = "+b);
        }catch(Exception e){ }
    }
    
}

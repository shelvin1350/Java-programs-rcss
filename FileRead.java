import java.util.*;
import java.io.*;
class FileRead {
    public static void main(String args[])
    {
        FileInputStream f;
        Scanner s= new Scanner(System.in);
        String fname;
        try{
            System.out.println("Enter the file name:");
            fname = s.nextLine();
            f=new FileInputStream(fname);
            int ch;
            ch=f.read();
            while(ch!=-1)
            {
                System.out.print((char)ch);
                ch=f.read();
            }
            f.close();
        }
        catch(Exception e)
        {
            System.out.println(e);    
        }
    }
}

import java.io.*;
import java.util.*;
class FileReadW {
    public static void main(String args[]){
    FileInputStream f;
    Scanner s= new Scanner(System.in);
    String fname;
    try{
        System.out.println("Enter the filename:");
        fname=s.nextLine();
        f=new FileInputStream(fname);
        byte b[];
        b=new byte[f.available()];
        f.read(b);
        String data=new String(b, 0, b.length);
        System.out.println(data);
        f.close();
    }
    catch(Exception e)
    {
        System.out.println(e);
    }
    }

}

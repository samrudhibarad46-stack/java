import java.io.*;
public class FileReader1
{
    public static void main(String args[])
    {
     try
     {
         FileReader fr =new FileReader("data.txt");
         int i;
         while((i=fr.read()) !=-1)
         {
             System.out.println((char)i);
         }    
     }
     catch(Exception e)
     {
         System.out.print(e);
     }    
    }
}

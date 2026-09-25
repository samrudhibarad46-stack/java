import java.io.*;
public class copyfile
{
    public static void main(String args [])
    {
     try
     {
         FileReader fr=new FileReader("data.txt");
         FileWriter fw=new FileWriter("new.txt");
         int i;
         while((i=fr.read()) !=-1)
         {
             fw.write(i);
         }
         fr.close();
         fw.close();
        System.out.println("file copied...");
     }
     catch(Exception e)
     {
         System.out.println(e);
     }
    }
}

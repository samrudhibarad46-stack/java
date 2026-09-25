import java.io.*;
public class FileOddEven 
{
   public static void main(String args [])
    {
     try
     {
        FileWriter odd=new FileWriter("oddno.txt");
        FileWriter even=new FileWriter("evenno.txt");
        for(int i=1;i<=50;i++)
        {
            if(i%2==0)
                even.write(i+" ");
            else
                odd.write(i+" ");
        
        }
        odd.close();
        even.close();
        System.out.println("succssfully...");
     
     }
     catch(Exception e)
     {
         System.out.print(e);
     }
     }
  }  


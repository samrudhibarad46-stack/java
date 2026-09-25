import java.io.*;
public class Demo
{
    public static void main(String args[])
    {
        try
        {
            FileWriter fw=new FileWriter("data.txt");
            fw.write("BARAD SAMRUDHI");
            fw.close();   
            System.out.println("Dtat write succsefull..");
        }
       catch(Exception e)
       {
           System.out.println("e");
       }
    }
}

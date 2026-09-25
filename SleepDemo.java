class D extends Thread
{
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println("from A1..i="+i);
            try
            {
                Thread.sleep(5000);
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
     
    }
}
public class SleepDemo 
{
    public static void main(String args[])
    {
      D d1=new D();
      d1.start();
   
    }
}    

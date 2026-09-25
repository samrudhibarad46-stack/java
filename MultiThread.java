class A1 extends Thread
{
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println("from A1..i="+i);
        }
    }
}
class B1 extends Thread
{
    public void run()
    {
        for(int j=1;j<=5;j++)
        {
            System.out.println("from B1..j="+j);
        }
    }
}
public class MultiThread
{
    public static void main(String args[])
    {
        A1 a1=new A1();
        B1 b1=new B1();
        a1.start();
        b1.start();
    }
}

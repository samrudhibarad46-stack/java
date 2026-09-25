class B implements Runnable
{
    public void run()
    {
        System.out.println("hello testing...");
    }
}
public class ImplementThread 
{
    public static void main(String args[])
    {
        B b1=new B();
        Thread t1=new Thread(b1);
        t1.start();
    }
}

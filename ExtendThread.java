class A extends Thread
{
    public void run()
    {
        System.out.println("hello..");
    }
}
public class ExtendThread
{
    public static void main(String[] args) 
    {
        A a1=new A();
        a1.start();
    }
}

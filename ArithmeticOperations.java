import java.util.*;
public class ArithmeticOperations
{
    public static void main(String[] args)
    {
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value A:");
        a=sc.nextInt();
        System.out.println("Enter value B:");
        b=sc.nextInt();
        
        System.out.println("A+B="+(a+b));
        System.out.println("A-B="+(a-b));
        System.out.println("A*B="+(a*b));
        System.out.println("A/B="+(a/b));
    }
}

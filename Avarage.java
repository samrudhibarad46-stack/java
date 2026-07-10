import java.util.*;
public class Avarage
{
     public static void main(String[] args)
     {
        int a,b,c;
        float avg;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value A:");
        a=sc.nextInt();
        System.out.println("Enter value B:");
        b=sc.nextInt();
        System.out.println("Enter value c:");
        c=sc.nextInt();
        avg=(a+b+c/3);
        System.out.println(" Avare= "+avg);
     }
}

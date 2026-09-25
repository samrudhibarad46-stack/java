import java.util.*;
class University
{
    String uname,ucity;
    int tot_stud;
    
    void getUni()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter University Name:");
        uname=sc.next();
        System.out.print("Enter University  city Name:");
        ucity=sc.next();
        System.out.print("Enter  total student:");
        tot_stud=sc.nextInt();
        
    }
}
class Department extends University
{
    int deptno;
    String deptnm;
    
    void getDept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter department no:");
        deptno=sc.nextInt();
        System.out.print("Enter department Name:");
        deptnm=sc.next();
    }
    void display()
    {
        System.out.println("Enter University Name:"+uname);
        System.out.println("Enter University  city Name:"+ucity);
        System.out.println("Enter  total student:"+tot_stud);
        System.out.println("Enter department no:"+deptno);
        System.out.println("Enter department Name:"+deptnm);
        

    }
}
public class unidemo2_1 
{
    public static void main(String args[])
    {
    Department d1=new Department();
    Department d2=new Department();
    d1.getUni();
    d1.getUni();
    
    System.out.println("\nEnter  :details for object1:");
    d1.getUni();
    d1.getUni();
    
    System.out.println("\nEnter  :details for object2:");
    d2.getUni();
    d2.getUni();
    
    System.out.println("\nEnter  :details for object1:");
    d1.getUni();
    
    System.out.println("\nEnter  :details for object2:");
    d2.getUni();
  
    }
    
}

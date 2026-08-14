import java.util.*;
class company
{
    int ccode;
    String cname;
    void getcmp(int cc,String cnm)
    {
        ccode=cc;
        cname=cnm;
    }
}
class employee extends company
{
    int id,salary;
    String name;
    void getemp(int i,String nm,int sly)
    {
        id=i;
       salary=sly;
       name=nm;
    }
       void show()
       {
            System.out.println();
            System.out.println("company details");
            System.out.println("ccode="+ccode);
            System.out.println("cname="+cname);
            System.out.println("id="+id);
            System.out.println("salary="+salary);
            System.out.println("name="+name);    
       }
       
    }
public class comdemo
{
    public static void main(String args[])
    {
        employee e1=new employee();
        employee e2=new employee();
        
        e1.getcmp(12,"java");
        e2.getcmp(11,"c");
        
        e1.getemp(1,"samrudhi",2000);
        e2.getemp(2,"shruti",2000);
        
        e1.show();
        e2.show();
    }
}

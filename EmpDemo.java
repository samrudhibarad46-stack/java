class Emp
{
    int id,salary;
    String name,city;
    void getEmp(int i ,String nm, int sly ,String ct)
    {
        id=i;
        salary=sly;
        name=nm;
        city=ct;
    }       
    void putEmp()
    {
        System.out.println("Emp id:"+id);
        System.out.println("Emp name:"+name);
        System.out.println("Emp salary:"+salary);
        System.out.println("Emp city:"+city);
    }
    
}
public class EmpDemo
{
     public static void main(String[] args)
     {
         Emp e1=new Emp();
         Emp e2=new Emp();
         
         e1.getEmp(1,"raj",15000,"rajkot");
         e2.getEmp(2,"dev",3000,"rajkot");
         e1.putEmp();
         System.out.println("_________");
         e2.putEmp();
     }
}

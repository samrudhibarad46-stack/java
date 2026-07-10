import java.util.*;
class Rectangle
{
    float len,wid;
    void setvalue()
    {
        len=15.0f;
        wid=25.0f;
    } 
    float area()
    {
        return (len*wid);
    }
}        
public class RectangleDemo 
{
   public static void main(String[] args)
     { 
        Rectangle R1=new Rectangle();
        R1.setvalue();
        System.out.print("Area of Rectangle"+R1.area());

     }
}

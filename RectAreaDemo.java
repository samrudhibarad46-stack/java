class RectArea
{
    int lenght,width;
    RectArea(int ln,int wi)
    {
        lenght=ln;
        width=wi;
    }
    void Area()
    {
        System.out.println("Ractangle area:"+lenght*width);
    }        
}
public class RectAreaDemo
{
 public static void main(String args[])
 {
     RectArea r1=new RectArea(45,5);
     r1.Area();
 }
}

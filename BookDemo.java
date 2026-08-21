class Book
{
    String title;
    int price;
    
    void getBook(String ti,int pr)
    {
        title=ti;
        price=pr;
    }
    
    void putBook()
    {
        System.out.println("Book title:"+title);
        System.out.println("Book price:"+price);
        System.out.println();
        System.out.println("...........");
        System.out.println();
    }       
}
public class BookDemo 
{
    public static void main(String args[])
    {
        Book b1=new Book();
        Book b2=new Book();
    
        b1.getBook("mahabhart",500);
        b2.getBook("ramayan",600);
        
        b1.putBook();
        b2.putBook();
    }
    
}

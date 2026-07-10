import java.util.*;
class Stud
{
    String name;
    int age;
    char gender;

    Stud()
    {
        name = "samrudhi";
        age = 19;
        gender = 'f';
    }

    Stud(String nm, int ag, char gn) 
    {
        name = nm;
        age = ag;
        gender = gn;
    }

    void show() 
    {
        System.out.println("Name   : " + name);
        System.out.println("Age    : " + age);
        System.out.println("Gender : " + gender);
    }
}

public class StudDemo
{
    public static void main(String[] args) 
    {  
        Stud s1 = new Stud();
        Stud s2 = new Stud("Samrudhi", 20, 'F');
        System.out.println("Student 1 Details:");
        s1.show();
        System.out.println("Student 2 Details:");
        s2.show();
    }        
}
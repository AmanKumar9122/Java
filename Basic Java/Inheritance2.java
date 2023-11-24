//we can't inherit the constructor or any private member in derived class
class Human1 // base class
{
    private String name;
    int age;

    Human1()
    {
        System.out.println("Human class Constructor");
    }

    void sleep()
    {
        age=18;
        System.out.println("Human needs good sleep");
        System.out.println(age);
    }
}
class Student1 extends Human1 // derived class
{
    // public Studemt1()
    // {
        //super();
    // }
    void disp()
    {
        System.out.println(" The age is : " + age);
       // System.out.println(" The Name is : " + name);
    }
}

public class Inheritance2 
{
    public static void main(String[] args) 
    {
        Student1 st1=new Student1();
        st1.sleep();
        st1.disp();
        
    }
    
}

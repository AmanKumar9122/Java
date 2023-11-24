//hierarchical inheritance
class Demo1{
     void disp()
     {
         System.out.println("Disp wrttien in demo1 class");
     }
}
 class Demo2 extends Demo1
{

}
class Demo3 extends Demo2
{

}
public class Inheritance4 
{
    public static void main(String[] args) 
    {
        Demo3 d=new Demo3();
        d.disp();
    }
    
}
//object class is parent of all the classes in java
//if we are not using extends keyword then automatically that class parent is object class
//object class also a class like scanner class , etc...
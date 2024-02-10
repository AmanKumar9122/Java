//single or simple inheritance
class Animal 
{
    public void eat()
    {
        System.out.println("Animal eats everyday");
    }
    public void age(int x)
    {
        System.out.println("Animal age is "+ x);
    }
    
}

class Tiger extends Animal
{
   public void eat()
   {
    System.out.println("Tiger hunts and eat");
   } 
}

public class Inheritance3 
{
    public static void main(String[] args) 
    {
      Tiger t=new Tiger();
      t.eat();  
      t.age(15);  
    }   
}

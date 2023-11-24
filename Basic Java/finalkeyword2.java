// final class Animal1
// {
//     void sleep()
//     {
//         System.out.println("Animal is sleeping");
//     }
// }
class Animal1
{
    final int age=19;
    final void sleep()
    {
        //age=20;
        System.out.println("Animal is sleeping");
    }
}

        
class Tiger1 extends Animal1
{
    // void sleep()final method we cannot ovverride in child class
    // {

    // }
}
public class finalkeyword2 {
    public static void main(String[] args) {
        Tiger1 t=new Tiger1();
        t.sleep();
    }
    
}

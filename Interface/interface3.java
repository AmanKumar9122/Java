interface A{
    void show();
}
interface X{
    void abc();
}
class B implements A,X{
     public void show(){
        System.out.println("In Show");
     }
     public void abc(){
        System.out.println("I AM AMAN");
    }
    }

public class interface3 {
    public static void main(String[] args) {
        B obj = new B();
        obj.show();
        obj.abc();
    }  
}
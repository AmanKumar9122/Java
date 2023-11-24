//innerclass= member/static/anonymous
class A{
    public void show(){
        System.out.println("in show");
    }
    class B{
        public void display(){
            System.out.println("in display");
        }
    }
}
public class innerclass {
    public static void main(String[] args) {
    A obj= new A();
    A.B obj1=obj.new B();
    obj.show();
    obj1.display();    
    }
}

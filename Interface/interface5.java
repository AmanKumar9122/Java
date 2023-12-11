
class A implements inter{
        public void inform(){
            System.out.println("..............");
        }
        public static void main(String[] args) {
            A obj = new A();
            obj.inform();
            obj.local();
            inter.display();
        }
    }
    interface inter{
    void inform();
    default void local(){
        System.out.println("Welcome");
    }
    static void display(){
        System.out.println("Static method inside inerface.");
    }
}
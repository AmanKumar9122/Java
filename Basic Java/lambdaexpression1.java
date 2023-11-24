interface car{
    void drive();
}
public class lambdaexpression1 {
    public static void main(String[] args) {
        car obj = () -> System.out.println("Driving...");
        obj.drive();
    }   
}
interface car{
    void display (int avg);
}
public class lambdaexpression2 {
public static void main(String[] args) {
    car obj = avg -> System.out.println("Driving... "+ avg);
    obj.display(15);
    }    
}

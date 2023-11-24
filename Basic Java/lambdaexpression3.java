interface car{
    void display (int avg,int ts);
}
public class lambdaexpression3 {
    public static void main(String[] args) {
        car obj = (avg,ts) -> System.out.println("Driving... "+ avg + " " + ts);
    obj.display(15,120);       
    }    
}
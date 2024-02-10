/**
 * Anonymous class
 */
interface car{
    void drive();
}
public class innerclass4 {
    public static void main(String[] args) {
      car obj = new car() {
        public void drive(){
            System.out.println("Driving.....");
        }
      }; 
      obj.drive(); 
    }
}
public class MethodOverloadingExample {
    public static void main(String[] args) {
        MethodOverloadingExample example = new MethodOverloadingExample();
        example.displayData(10);
        example.displayData("Hello");
        example.displayData(3.14);
    }
    
    public void displayData(int num) {
        System.out.println("The number is: " + num);
    }
   
    public void displayData(String text) {
        System.out.println("The text is: " + text);
    } 
    
    public void displayData(double value) {
        System.out.println("The value is: " + value);
    }
}
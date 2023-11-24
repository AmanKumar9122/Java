import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        System.out.println("5.Exit");

        System.out.println("Enter Your Choice");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
            System.out.println("Enter two numbers to add:");
            int num1= sc.nextInt();
            int num2= sc.nextInt();
            int sum = num1+num2;
            System.out.println("The sum is: "+sum);
            break;
            case 2:
                System.out.println("Enter two numbers to subtract:");
                int num3 = sc.nextInt();
                int num4 = sc.nextInt();
                int difference = num3 - num4;
                System.out.println("The difference is: " + difference);
                break;
            case 3:
                System.out.println("Enter two numbers to multiply:");
                int num5 = sc.nextInt();
                int num6 = sc.nextInt();
                int product = num5 * num6;
                System.out.println("The product is: " + product);
                break;
            case 4:
                System.out.println("Enter two numbers to divide:");
                int num7 = sc.nextInt();
                int num8 = sc.nextInt();
                int quotient = num7 / num8;
                System.out.println("The quotient is: " + quotient);
                break;
            case 5:
                System.out.println("Exiting...");
                break;
        
            default:
            System.out.println("Invalid choice!");
        }   
    }   
}
import java.util.Scanner;

public class class1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your Name: ");
        String name = scanner.nextLine();
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        System.out.println("Enter your favorite number: ");
        double favoriteNumber = scanner.nextDouble();

        scanner.nextLine();

        System.out.println("Enter a sentence: ");
        String sentence = scanner.nextLine();

        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Favorite Number: "+favoriteNumber);
        System.out.println("Sentence: "+sentence);

        scanner.close();


    }
    
}

import java.util.Scanner;

public class BinaryNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println(Integer.toBinaryString(i));
        }

        scanner.close();
    }
}
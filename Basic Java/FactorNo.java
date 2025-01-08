import java.util.*;
public class FactorNo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value :");
        int x = sc.nextInt(); // Changed to int for proper modulus operation
        for (int i = 1; i <= Math.sqrt(x); i++) { // Start from 1 to avoid division by 0
            if (x % i == 0) { // Check if i is a factor
                list.add(i);
                if (i != x / i) { // Avoid adding the same factor twice
                    list.add(x / i);
                }
            }
        }
        Collections.sort(list); // Sort the factors
        System.out.println(list);
    }
}

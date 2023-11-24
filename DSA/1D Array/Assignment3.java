import java.util.Scanner;

public class Assignment3 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Element: ");
        n = sc.nextInt();
        System.out.println("Enter the Elements: ");
        int arr[] = new int[10];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        for (int val : arr) {
            max = Math.max(max, val);
        }
        System.out.print("Largest in given array is " + max);
    }
}

import java.util.Scanner;

public class Assignment1a {
    public static void main(String[] args) {
        int n;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Size of Array: ");
        n=sc.nextInt();
        int [] arr = new int[10];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int sum= 0,i=0;
        while (i<n) {
            sum += arr[i];
            i += 2;
        }
        System.out.println("Sum of elements at even Index is: "+sum);
    }
}

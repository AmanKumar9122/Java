import java.util.Scanner;
public class Assignment5 {
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
        for(int i=1;i<n-1;i++){
            if(arr[i-1]<arr[i]&&arr[i]>arr[i+1]);
            System.out.println(arr[i]);
            break;
        }
    }
}

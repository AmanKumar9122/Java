import java.util.Scanner;
public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();
        System.out.println("Enter the Elements: ");
        int [] arr = new int[n];
        
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter target Element: ");
        int x =sc.nextInt();
        // implementation of linear search
        int idx = -1;
        for(int i=0;i<n;i++){
        if(arr[i]==x){
            idx=i;
            break;
        }
        }
        if(idx==-1){
            System.out.println("Search element is not found in an array");
        }
        else{
            System.out.println("Searched element is found at the location:"+ idx);
    }
    }
}

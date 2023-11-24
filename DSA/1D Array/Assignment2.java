import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {
        int n;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Number of Elements:");
        n=sc.nextInt();
        System.out.println("Enter the Elements: ");
        int arr[] = new int[5];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Even no. ");
        for (int nums :arr){
            if(nums % 2 == 0 ){
             System.out.println (nums);
            }
        } 
    }  
}
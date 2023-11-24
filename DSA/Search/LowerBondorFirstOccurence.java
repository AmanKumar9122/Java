//time complexity= O(logN)
//space complexity= O(1)
import java.util.Scanner;
public class LowerBondorFirstOccurence {
    public static int FirstOccurence(int [] arr , int target)
    {
        int low=0,high=arr.length-1,result=-1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if (arr[mid]==target){
                result = mid;
                high =mid-1;
            }
            else if(arr[mid]<target){
                low = mid+1;
            }
            else{
                low = mid-1;
            }
            }
            return result;
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of element:");
        int n = sc.nextInt();
        System.out.println("Enter the Elements:");
        int []arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the target element: ");
        int x = sc.nextInt();
        
        // Function calling of binarySearch

        int result = FirstOccurence(arr,x);
        if(result == -1){
            System.out.println("Searched element is not found in Array");
        }
        else {
            System.out.println("Searched element found at Index no. :"+result);
        }
    } 
}
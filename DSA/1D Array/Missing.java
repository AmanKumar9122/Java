//time complexity - O(n)
//Space Complexity - O(1)
public class Missing {
    public static void main(String[] args) {
        int arr[] = {1,2,3,7,6,5};
        int n=arr.length;
        // sum of natural no. in an array 
        int sum_natural_num = ((n+1)*(n+2))/2;
        int sum = 0;
        // sum of current elements present in an array
        for(int i=0;i<n;i++){
            sum += arr[i];
        }
         int missing_element = 0;
         missing_element = sum_natural_num - sum;
         System.out.println("Missing element in an array is:"+ missing_element);
    }
    
}

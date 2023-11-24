// Time Complexity: O(n/2) = O(n)
// Space Complexity: O(1)

public class Palindrome {
    public static void main(String[] args) {
        int[] arr={1,2,3,2,1,4};
        int n = 6;
        int flag = 0;
        for(int i=0;i<n/2;i++){
            // comparison between the start and the end element
            if(arr[i]!=arr[n-i-1]){
                flag=1;
                System.out.println("Not a palindrome array");
                break;
            }
        }
        if(flag == 0){
            System.out.println("Palindrome Array");
        }
    }
}

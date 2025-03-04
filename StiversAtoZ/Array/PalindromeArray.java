public class PalindromeArray {
    public static boolean isPalindrome(int[] arr) {
        for(int i=0; i<arr.length/2; i++){
            if(arr[i] != arr[arr.length-i-1]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 2, 1 };
        System.out.println(isPalindrome(arr));
    }
}

// Complexity Analysis:
// Time Complexity: The for loop runs for half the size of the array (𝑛/2), so the time complexity is O(n).
// Space Complexity: The algorithm uses a constant amount of extra space for the loop variable, so the space complexity is O(1).

// public class PalindromeArray {
//     public static boolean isPalindrome(int[] arr) {
//         int left = 0;
//         int right = arr.length - 1;
//         while (left < right) {
//             if (arr[left] != arr[right]) {
//                 return false;
//             }
//             left++;
//             right--;
//         }
//         return true;
//     }

//     public static void main(String[] args) {
//         int[] arr = { 1, 2, 3, 2, 1 };
//         System.out.println(isPalindrome(arr));
//     }
// }


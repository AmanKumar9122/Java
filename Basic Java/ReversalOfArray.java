import java.util.*;
public class ReversalOfArray {
    public void reverseArray(int num[]){
        int left=0;
        int right=num.length-1;
        while(left<right){
            int temp = num[left];
            num[left] = num[right];
            num[right] = temp;
            left++;
            right--;
        }
    }
    public static void main(String[] args) {
        int num[] = {1,2,3,4,5};
        ReversalOfArray obj = new ReversalOfArray();
        obj.reverseArray(num);
        System.out.println(Arrays.toString(num));
    }
}

// Complexity Analysis:
// Time Complexity: The while loop runs for half the size of the array (𝑛/2),so the time complexity is O(n).
// Space Complexity: The algorithm uses a constant amount of extra space for the temp variable and pointers, so the space complexity is O(1).
// Summary: Your code is efficient, correct, and well-implemented. It reverses the array in-place, achieving optimal time and space complexity.
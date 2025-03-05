//optimized solution
// public class ContainerWIthMostWater {
//     public int maxArea(int[] height) {
//         int left = 0, right = height.length - 1;
//         int maxA = 0;
        
//         while (left < right) {
//             int area = Math.min(height[left], height[right]) * (right - left);
//             maxA = Math.max(maxA, area);
            
//             // Move the pointer with the smaller height
//             if (height[left] < height[right]) {
//                 left++;
//             } else {
//                 right--;
//             }
//         }
        
//         return maxA;
//     }    
//     public static void main(String[] args) {
//         int[] height = {1,8,6,2,5,4,8,3,7};
//         ContainerWIthMostWater obj = new ContainerWIthMostWater();
//         System.out.println(obj.maxArea(height));  
//     }
// }

// Complexity Analysis:
// Time Complexity: O(n), where n is the size of the input array.
// Space Complexity: O(1). The space complexity is O(1) because we are using a constant amount of extra space for the loop variables.


//Brute Force Solution
public class ContainerWIthMostWater {
    public int maxArea(int[] height) {
        int n = height.length;
        int maxA = 0;
        
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int area = Math.min(height[i], height[j]) * (j - i);
                maxA = Math.max(maxA, area);
            }
        }
        
        return maxA;
    }    
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        ContainerWIthMostWater obj = new ContainerWIthMostWater();
        System.out.println(obj.maxArea(height));  
    }
}

// Complexity Analysis:
// Time Complexity: O(n^2), where n is the size of the input array.
// Space Complexity: O(1). The space complexity is O(1) because we are using a constant amount of extra space for the loop variables.
// Equilibrium Index: Find an index in an array such that the sum 
// of elements to the left is equal to the sum of elements to the 
// right. 
public class Q2 {
    public int index(int arr[]) {
        int totalSum = 0;
        for (int num : arr) {
            totalSum += num;
        }
        int leftSum = 0;
        for (int i=0;i<arr.length;i++) {
            int rightSum = totalSum - leftSum - arr[i];
            if (leftSum == rightSum) {
                return i;
            }
            leftSum += arr[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 2, 1};
        Q2 obj = new Q2();
        System.out.println(obj.index(arr));  // Output: 2
    }
}

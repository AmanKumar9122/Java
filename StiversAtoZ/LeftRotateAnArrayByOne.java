public class LeftRotateAnArrayByOne {
    static int[] rotateArray(int[] arr, int n) {
        // Write your code here.
        int temp = arr[0];
        for(int i=0;i<n-1;i++){
            arr[i]=arr[i+1];
        }
        arr[n-1]=temp;
        return arr;
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int n = arr.length;
        int[] rotatedArray = rotateArray(arr, n);
        
        System.out.println("Array after left rotation by one: ");
        for (int i = 0; i < n; i++) {
            System.out.print(rotatedArray[i] + " ");
        }
    }
}
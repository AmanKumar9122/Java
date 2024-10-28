public class sortanArray {
    public static void main(String[] args) {
        int arr[] = {1,1,1,2,2,2,0,0,0,1,2};
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            if (arr[left] < min) {
                min = arr[left];
            }
            if (arr[left] > max) {
                max = arr[left];
            }
            if (arr[right] < min) {
                min = arr[right];
            }
            if (arr[right] > max) {
                max = arr[right];
            }
            left++;
            right--;
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        
    }
    
}

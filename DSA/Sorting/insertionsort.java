import java.util.Arrays;

public class insertionsort {
    public static void insertionsort(int[] arr) {
        for (int i=0;i<arr.length;i++){
            int j=i;
            while(j>0&&arr[j]<arr[j-1]){
                int temp = arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }
        }
    }
    public static void main(String[] args) {
        int []arr = {20,50,25,67,79,12,15};
        insertionsort(arr);
        System.out.println("Sorted arrayis: ");
        System.out.println(Arrays.toString(arr));
    }
    
}

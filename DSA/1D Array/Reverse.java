public class Reverse {
    public static void main(String[] args) {
        int [] arr = {2,4,6,8,10};
        int n= 5;
        for (int i=0;i<n/2;i++)
        {
            //swap two elements in a array
            int temp = arr[i];
            arr[i] = arr[n-i-1];
            arr[n-i-1] = temp;
        }
        System.out.println("Reversed array is:");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+ " ");
        }
    }
}

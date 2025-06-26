import java.util.*;
public class Q13 {
    public int count(int arr[]){
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Q13 q = new Q13();
        int arr[] = new int[4];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(q.count(arr));
        sc.close();
    }
}
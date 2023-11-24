import java.util.Scanner;
public class Assignment4 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Element: ");
        n = sc.nextInt();
        System.out.println("Enter the Elements: ");
        int arr[] = new int[10];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        for (int num:arr){
            max1=Math.max(max1, num);
        }
        for (int num:arr){
            if(num != max1){
                max2 = Math.max(max2, num);
            }
        }
        if(max2 == Integer.MIN_VALUE){
            System.out.println("No second largest element found");
        }
        else{
            System.out.println("The Second largest element is:"+max2);
        }
    }
}

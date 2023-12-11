//time complexity = O(n^3) wrost time complexity
import java.util.*;
public class subarray {
    public static void printsubarray(int num[]){
        int ts=0;
        int currentsum=0;
        int maxSum =Integer.MIN_VALUE;
        int minSum =Integer.MAX_VALUE;
        for(int i=0;i<num.length;i++){
            int start = i;
            for(int j=i;j<num.length;j++){
                int end = j;
                currentsum=0;
                for(int k= start;k<=end;k++){ //print
                    System.out.print(num[k]+" "); //subarray
                    currentsum += num[k];
                }
                ts++;
                System.out.println ("SubArray Sum:" +currentsum);
                if(maxSum<currentsum){
                    maxSum=currentsum;
                }
                if(minSum>currentsum){
                    minSum=currentsum;
                }
            }
            System.out.println();
        }
        System.out.println("total subarray = "+ ts);
        System.out.println("Maximum Sum of Sub Array="+maxSum);
        System.out.println("Minimum Sum of Sub Array="+minSum);
    }
    public static void main(String[] args) {
        int num[]={2,4,6,8,10};
        printsubarray(num);
        }
}

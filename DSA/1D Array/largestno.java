import java.util.*;
public class largestno {
    public static int getLargest(int number[]){
        int largest = Integer.MIN_VALUE;//-infinity
        int smallest = Integer.MAX_VALUE;//+infinity

        for (int i=0;i<number.length;i++){
            if(largest<number[i]){
                largest=number[i];
            }
            if(smallest>number[i]){
                smallest=number[i];
            }
        }
        System.out.println("Smallest no. :"+smallest);
        return largest;
    }
    public static void main(String[] args) {
        int number[]= {1,2,6,3,5};
        System.out.println("largest value is: "+getLargest(number));
    } 
}
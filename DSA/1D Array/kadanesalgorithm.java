// time complexity- O(n) better than previous 2 approches
import java .util.*;
public class kadanesalgorithm {
    public static void kadanes(int num[]){
        int ms = Integer.MIN_VALUE;
        int cs = 0;
    for(int i=0;i<num.length;i++){
        cs = cs +num[i];
        if(cs<0){
            cs =0;
        }
        ms = Math.max(cs, ms);
        }
        System.out.println("Our max Subarray Sum is: "+ms);
    }
public static void main(String[] args) {
        int num[]={-2,-3,4,-1,-2,1,5,-3};
        kadanes(num);
        }
}


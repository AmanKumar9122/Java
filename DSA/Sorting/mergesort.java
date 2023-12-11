import java.util.*;
public class mergesort {
    public static void msort(int arr[], int si,int ei){
        if(si>=ei){
            return ;
        }
        int mid = si +(ei-si)/2;
        msort(arr, si, mid);
        msort(arr, mid+1, ei);
        merge(arr,si,mid,ei);
    }
    public static void main(String[] args) {
        int arr [] = {1,2,6,4,8,7};
        System.out.println(msort(arr, 0, 5));
    }
}

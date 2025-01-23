import java.util.*;
public class MergeSortAlgo {
    public void mergeSort (int arr[],int low,int mid,int high){
        ArrayList<Integer> temp = new ArrayList<Integer>();
        int left = low;
        int right = mid+1;
        while(left<=mid && right<=high){
            if(arr[left]<arr[right]){
                temp.add(arr[left]);
                left++;
            }else{
                temp.add(arr[right]);
                right++;
            }
        }
        while (left<=mid){
            temp.add(arr[left]);
            left++;
        }
        while (right<=high){
            temp.add(arr[right]);
            right++;
        }
        for (int i = 0; i < temp.size(); i++) {
            arr[low+i] = temp.get(i);
        }
    }
    public void sort(int arr[],int low,int high){
        if(low<high){
            int mid = (low+high)/2;
            sort(arr,low,mid);
            sort(arr,mid+1,high);
            mergeSort(arr,low,mid,high);
        }
    }
    public static void main(String[] args) {
        int arr[] = {12, 11, 13, 5, 6, 7};
        MergeSortAlgo obj = new MergeSortAlgo();
        obj.sort(arr,0,arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}

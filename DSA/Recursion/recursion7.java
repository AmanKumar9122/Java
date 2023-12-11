// first occurance in an array
public class recursion7 {
    public static int Occurance(int arr [],int key, int i) {
        if(i==arr.length-1){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return Occurance(arr, key, i+1);
    }
    public static void main(String[] args) {
        int arr[] = {8,6,9,7,5};
        System.out.println(Occurance(arr, 9, 0));
    }
}

public class Duplicate {
    public static void main(String[] args) {
        int []arr ={2,3,3,6,6,9};
        int n = arr.length;

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i] == arr[j]){
                    System.out.println("Duplicate Element found is:"+ arr[i]);
                }
            }
        }
    }
}

public class array2 {
    public static void main(String[] args) {
        int a[]= new int[4];//on directly declearing an array it doesn't goes to heap memory we have to use this syntax to store values in heap memory.
        a[0]=5;
        a[1]=4;
        a[2]=6;
        a[3]=9;
        for(int i=0;i<4;i++){
            System.out.println(a[i]);
        }
    }
}

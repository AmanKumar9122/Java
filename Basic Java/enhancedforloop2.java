public class enhancedforloop2 {
    public static void main(String[] args) {
        int arr[][]={{2,5,1},
                   {5,4,6},
                   {8,2,9}};
    for(int a[]:arr){
        for(int b:a){
        System.out.print(b + " ");
        }
        System.out.println();
    }
    }
}

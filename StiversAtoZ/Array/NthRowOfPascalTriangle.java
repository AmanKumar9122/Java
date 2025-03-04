public class NthRowOfPascalTriangle {
    public static void main(String[] args) {
        int n = 5;
        int ans = 1;
        System.out.println(ans);
        for(int i=0;i<n;i++){
            ans = ans*(n-i);
            ans = ans/(i+1);
            System.out.println(ans);
        }
    }
}

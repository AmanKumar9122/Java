//printing sum of first n natural no.
public class recursion4 {
    public static int sum(int n) {
        if(n==1){
            return 1;
        }
        int fn = n + sum(n-1);
        return fn;
    }
    public static void main(String[] args) {
        System.out.println(sum(5));
    }
}
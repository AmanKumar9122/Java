//fibonacci 
// space complexity = O(n)
// time complexity = O(2^n) 

public class recursion5 {
    public static int fab(int n) {
        if(n==0||n==1){
            return n;
        }
        int fabn=fab(n-1)+fab(n-2);
        return fabn; 
    }
    public static void main(String[] args) {
        System.out.println(fab(25));
        System.out.println(fab(26));
        System.out.println(fab(27));
        System.out.println(fab(28));
        System.out.println(fab(29));
    }
}

public class recursion10 {
    public static int Optimsedpower(int x,int n){
        if(n==0){
            return 1;
        }
        int halfpower = Optimsedpower(x, n/2);
        int halfpowerSq = halfpower * halfpower;

        if(n%2!=0){
            halfpowerSq = x*halfpowerSq;
        }
        return halfpowerSq;
    }
    public static void main(String[] args) {
        System.out.println(Optimsedpower(2, 10));
    }
    
}

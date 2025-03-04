public class nCr {
    int nCr(int n, int r) {
        long res = 1;
        for(int i= 0;i<r;i++){
            res *= (n-i);
            res /= (i+1);
        }
        return (int)res;
    }
    public static void main(String[] args) {
        nCr obj = new nCr();
        System.out.println(obj.nCr(5,2));
    }
}

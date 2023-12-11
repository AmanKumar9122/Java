// first 10 natural no.
public class recursion2 {
    public static void printAsc(int n){
       if(n==1){
        System.out.print(1+" ");
        return;
       }
        printAsc(n-1);
       System.out.print(n+" ");
    }
    public static void main(String[] args) {
        int n=5;
        printAsc(n);
    }
    
}

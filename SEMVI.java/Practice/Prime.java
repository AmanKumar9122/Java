import java.util.*;
public class Prime {
    public boolean isPrime(int n){
        for(int i=2;i<n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Prime obj = new Prime();
        if(obj.isPrime(n)){
            System.out.println("Is a prime number");
        }else{
            System.out.println("Not a prime number");
        }
    }
}

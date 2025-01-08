import java.util.*;
public class ArmstrongNum {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int x = s.nextInt();
        int orig = x;
        int sum =0;
        int numDigit = (int)Math.log10(x)+1;

        while(x>0){
            int lastDigit=x%10;
            sum = sum + (int)Math.pow(lastDigit, numDigit);
            x/=10;
        }
        if(orig==sum){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
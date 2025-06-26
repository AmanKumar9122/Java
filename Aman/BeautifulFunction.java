import java.util.*;

public class BeautifulFunction {
    public int count(int n) {
        int temp = n;
        int countT = 0;
        while(temp >= 10) {
            temp += 1;
            while(temp % 10 == 0) {
                temp /= 10;
            }
            countT++;
        } 
        return countT + 9;
    }
    
    public static void main(String[] args) {
        BeautifulFunction bf = new BeautifulFunction();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int result = bf.count(n);
        System.out.println(result);
        scanner.close();
    }
}
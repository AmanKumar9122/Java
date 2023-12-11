import java.util.Scanner;

public class towerofhanoi {
    public static void hanoi(int n, char src, char hlp, char dst){
        if(n == 0) return;
        hanoi(n-1, src, dst, hlp);
        System.out.println(src + "->" + dst);
        hanoi(n-1, hlp, src, dst);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char src = 'A', hlp = 'B', dst = 'C';
        hanoi(n, src, hlp, dst);
    }
}
 
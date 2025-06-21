// https://cses.fi/alon/task/1629/

import java.util.*;
public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] movies = new int[n][2];
        for (int i = 0; i < n; i++) {
            movies[i][0] = sc.nextInt();
            movies[i][1] = sc.nextInt();
        }
        Arrays.sort(movies, Comparator.comparingInt(a -> a[1]));
        int count = 0;
        int lastEndTime = 0;
        for (int i = 0; i < n; i++) {
            if (movies[i][0] >= lastEndTime) {
                count++;
                lastEndTime = movies[i][1];
            }
        }
        System.out.println(count);
        sc.close();
    } 
}

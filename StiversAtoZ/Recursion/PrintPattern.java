// Print a sequence of numbers starting with n, without using a loop. Replace n with n - 5, n−5... until n≤0. Then, replace n with n+5, n + 5, n+5 until n regains its initial value. Complete the function pattern(n) which takes n as input and returns a list containing the pattern.
// Examples
// Input: n = 16
// Output: 16 11 6 1 -4 1 6 11 16
// Explanation: The value decreases until it is greater than 0. After that it increases and stops when it becomes 16 again.


import java.util.ArrayList;
import java.util.List;

public class PrintPattern {
    public void pattern(int N, List<Integer> print){
        if(N<=0){
            print.add(N);
            return;
        }
        print.add(N);
        pattern(N-5,print);
        print.add(N);
    }
    public List<Integer> pattern(int N){
        List<Integer> print = new ArrayList<>();
        pattern(N,print);
        return print;
    }
    public static void main(String[] args) {
        PrintPattern obj = new PrintPattern();
        System.out.println(obj.pattern(16));
    }
}
// Output: 16 11 6 1 -4 1 6 11 16
// Time complexity: O(n)
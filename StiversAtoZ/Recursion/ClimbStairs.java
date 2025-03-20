import java.util.*;
class ClimbStairs {
    public ArrayList<String> climbStairsPatterns(int n) {
        ArrayList<String> result = new ArrayList<>();
        generatePatterns(n, "", result);
        return result;
    }

    private void generatePatterns(int n, String path, ArrayList<String> result) {
        if (n == 0) {
            result.add(path);
            return;
        }

        if (n >= 1) {   
            generatePatterns(n - 1, path + "1", result);
        }

        if (n >= 2) {
            generatePatterns(n - 2, path + "2", result);
        }
    }
    public static void main(String[] args) {
        ClimbStairs obj = new ClimbStairs();
        System.out.println(obj.climbStairsPatterns(3));
    }
}
// time complexity: O(2^n)
// space complexity: O(2^n)
// // Output: [111, 12, 21]
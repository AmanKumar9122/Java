// The count-and-say sequence is a sequence of digit strings defined by the recursive formula:
// countAndSay(1) = "1"
// countAndSay(n) is the run-length encoding of countAndSay(n - 1).
// Run-length encoding (RLE) is a string compression method that works by replacing consecutive identical characters (repeated 2 or more times) with the concatenation of the character and the number marking the count of the characters (length of the run). For example, to compress the string "3322251" we replace "33" with "23", replace "222" with "32", replace "5" with "15" and replace "1" with "11". Thus the compressed string becomes "23321511".
// Given a positive integer n, return the nth element of the count-and-say sequence.
// Example 1:
// Input: n = 1
// Output: "1"
// Explanation: This is the base case.
// Example 2:
// Input: n = 4
// Output: "1211"

// approach: use recursion
// use while loop and reduce the time complexity
// use while loop instead of if else condition
// time complexity: O(n)
public class CountandSay {
    public static String countAndSay(int n) {
        if (n == 1) {
            return "1";
        }
        String str = countAndSay(n - 1);
        StringBuilder sb = new StringBuilder();
        int count = 1;
        for (int i = 0; i < str.length(); i++) {
            while (i + 1 < str.length() && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            while (i + 1 < str.length() && str.charAt(i) != str.charAt(i + 1)) {
                sb.append(count);
                sb.append(str.charAt(i));
                count = 1;
                i++;
            }
            sb.append(count);
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }
    //time complexity: O(n)
    //space complexity: O(n)
    
    public static void main(String[] args) {
        System.out.println(countAndSay(1)); // 1
        System.out.println(countAndSay(5)); // 1211
    }
}
// time complexity: O(2^n)
// space complexity: O(2^n)

//use two pointer approach
// public class CountandSay {
//     public static String countAndSay(int n) {
//         if (n == 1) {
//             return "1";
//         }
//         String str = countAndSay(n - 1);
//         StringBuilder sb = new StringBuilder();
//         int count = 1;
//         int i = 0;
//         int j = 1;
//         while (j < str.length()) {
//             if (str.charAt(i) == str.charAt(j)) {
//                 count++;
//                 j++;
//             } else {
//                 sb.append(count);
//                 sb.append(str.charAt(i));
//                 i = j;
//                 j++;
//                 count = 1;
//             }
//         }
//         sb.append(count);
//         sb.append(str.charAt(i));
//         return sb.toString();
//     }
//     public static void main(String[] args) {
//         System.out.println(countAndSay(1)); // 1
//         System.out.println(countAndSay(4)); // 1211
//     }
// }

//time complexity: O(n)
//space complexity: O(n)
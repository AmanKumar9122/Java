// public class PascalTriangle {
//     public static void main(String[] args) {
//         for(int n=0;n<=5;n++){
//         int ans = 1;
//         System.out.print(ans);
//         for(int i=0;i<n;i++){
//             ans = ans*(n-i);
//             ans = ans/(i+1);
//             System.out.print(ans);
//             }
//             System.out.println();
//         }
//     }
// }

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public static void main(String[] args) {
        int numRows = 6; // You can change this value to generate more rows
        List<List<Integer>> result = generate(numRows);
        
        // Printing the Pascal's Triangle
        for (List<Integer> row : result) {
            System.out.println(row);
        }
    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        for (int n = 0; n < numRows; n++) {
            List<Integer> row = new ArrayList<>();
            int ans = 1;
            row.add(ans); // First element is always 1

            for (int i = 0; i < n; i++) {
                ans = ans * (n - i);
                ans = ans / (i + 1);
                row.add(ans);
            }

            triangle.add(row);
        }
        return triangle;
    }
}


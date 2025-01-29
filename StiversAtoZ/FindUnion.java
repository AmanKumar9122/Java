import java.util.ArrayList;
import java.util.TreeSet;

public class FindUnion {
    // Function to return a list containing the union of the two arrays.
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        // add your code here
        TreeSet<Integer> set = new TreeSet<>();
        // Add elements from first array
        for (int i = 0; i < a.length; i++) {
            set.add(a[i]);
        }
        
        // Add elements from second array
        for (int i = 0; i < b.length; i++) {
            set.add(b[i]);
        }
        
        return new ArrayList<>(set);
    }
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5};
        int b[] = {1, 2, 3};
        ArrayList<Integer> res = findUnion(a, b);
        for (int i = 0; i < res.size(); i++) {
            System.out.print(res.get(i) + " ");
        }
    }
}


import java.util.ArrayList;
import java.util.List;

public class GrayCode {
    public List<Integer> grayCode(int n) {
        List<Integer> l = new ArrayList<>();
        if (n == 1) {
            l.add(0);
            l.add(1);
            return l;
        }
        
        List<Integer> prev = grayCode(n - 1);
        l.addAll(prev);
        
        for (int i = prev.size() - 1; i >= 0; i--) {
            l.add(prev.get(i) + (int)Math.pow(2, n - 1));
        }
        
        return l;
    }
    public static void main(String[] args) {
        GrayCode gc = new GrayCode();
        List<Integer> l = gc.grayCode(3);
        for (int i : l) {
            System.out.print(i + " ");
        }
    }
}

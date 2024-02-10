import java.util.ArrayList;

public class Arraylist {
    static void ArraylistExamples(){
        ArrayList<Integer> l = new ArrayList<>();
        l.add(10);
        l.add(17);
        l.add(20);
        System.out.println(l);
        System.out.println(l.get(1)); //1-based indexing
        l.set(1, 15);
        System.out.println(l.contains(15));
        System.out.println(l);
    }
    public static void main(String[] args) {
        ArraylistExamples();
    }
    
}

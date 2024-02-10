import java.util.LinkedList;

public class Linkedlist {
    static void LinkedListExamples(){
        LinkedList<Integer> l = new LinkedList<>();
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
        LinkedListExamples();
    }
    
}

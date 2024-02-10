import java.util.ArrayDeque;

public class Deque {
    static void DequeExample(){
        ArrayDeque<Integer> dq = new ArrayDeque<>();
        //instead of ArrayDeque we can simply write deque
        dq.addFirst(1);
        dq.addFirst(2);
        dq.addLast(5);
        dq.addLast(6);
        System.out.println(dq);
        System.out.println(dq.pollFirst());
        System.out.println(dq.pollLast());
        System.out.println(dq);

    }
    public static void main(String[] args) {
        DequeExample();
    }
}

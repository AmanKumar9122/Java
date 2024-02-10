import java.util.*;
public class Queue {
    static void QueueInterfaceExamples(){
        LinkedList<Integer> q= new LinkedList<>();
        q.offer(1);
        q.offer(2);
        q.offer(3);
        System.out.println(q.peek());
        System.out.println(q.poll());
        System.out.println(q.peek());
        System.out.println(q.isEmpty());
        System.out.println(q.size());
        System.out.println(q);
        
    }
    static void PriorityQueueExample(){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(10);
        pq.add(5);
        pq.add(7);
        System.out.println(pq.peek());
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);

    }
    public static void main(String[] args) {
        //QueueInterfaceExamples();
        PriorityQueueExample();
    } 
}

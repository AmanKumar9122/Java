public class lengthOddOrEven {
    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    static Node head;

    public static void main(String[] args) {
        lengthOddOrEven list = new lengthOddOrEven();
        list.head = new Node(1);
        list.head.next = new Node(2);
        list.head.next.next = new Node(3);
        list.head.next.next.next = new Node(4);
        list.head.next.next.next.next = new Node(5);

        if (isLengthOddOrEven(head)) {
            System.out.println("The length of the linked list is odd.");
        } else {
            System.out.println("The length of the linked list is even.");
        }
    }

    public static boolean isLengthOddOrEven(Node head) {
        int count = 0;
        while (head != null) {
            count++;
            head = head.next;
        }
        return count % 2 != 0; // true if odd, false if even
    } 
    
}
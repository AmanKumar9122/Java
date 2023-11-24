import java.util.*;
public class LinkedList
 {
    private Node head;
    private static class Node
 {
        int data;
        Node next;
        Node(int data) 
{
            this.data = data;
            this.next = null;
        }
    }

    public void add(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void remove(int position) {
        if (head == null) {
            return;
        }

        Node current = head;
        if (position == 0) {
            head = current.next;
        } else {
            Node previous = null;
            int count = 0;
            while (current != null && count < position) {
                previous = current;
                current = current.next;
                count++;
            }
            if (current != null) {
                previous.next = current.next;
            }
        }
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);

        System.out.println("Linked List: ");
        linkedList.display();

        linkedList.remove(2);

        System.out.println("Linked List after removing element at position 2: ");
        linkedList.display();
    }
}

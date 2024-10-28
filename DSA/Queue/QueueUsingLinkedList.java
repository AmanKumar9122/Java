class QueueUsingLinkedList {
    private class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node front, rear;

    public QueueUsingLinkedList() {
        front = rear = null;
    }

    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
    }

    public int dequeue() {
        if (front == null) {
            System.out.println("Queue is empty");
            return -1;
        }
        int data = front.data;
        front = front.next;
        if (front == null) rear = null;
        return data;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public int peek() {
        if (front == null) {
            System.out.println("Queue is empty");
            return -1;
        }
        return front.data;
    }

    public void printQueue() {
        if (front == null) {
            System.out.println("Queue is empty");
            return;
        }
        Node temp = front;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        QueueUsingLinkedList queue = new QueueUsingLinkedList();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println("Queue after enqueues:");
        queue.printQueue(); // Output: 10 20 30

        System.out.println("Dequeued element: " + queue.dequeue()); // Output: 10

        System.out.println("Queue after dequeue:");
        queue.printQueue(); // Output: 20 30

        System.out.println("Peek front element: " + queue.peek()); // Output: 20

        queue.enqueue(40);
        System.out.println("Queue after enqueue 40:");
        queue.printQueue(); // Output: 20 30 40 
    }
}

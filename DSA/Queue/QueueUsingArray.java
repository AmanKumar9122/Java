class QueueUsingArray {
    private int[] arr;      
    private int front;      
    private int rear;
    private int capacity;   
    private int size;       

    public QueueUsingArray(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    // Enqueue operation
    public void enqueue(int value) {
        if (isFull()) {
            throw new RuntimeException("Queue is full");
        }
        rear = (rear + 1) % capacity;
        arr[rear] = value;
        size++;
    }

    // Dequeue operation
    public int dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        int value = arr[front];
        front = (front + 1) % capacity;
        size--;
        return value;
    }

    // Peek operation (view the front element)
    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        return arr[front];
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Check if the queue is full
    public boolean isFull() {
        return size == capacity;
    }

    // Get the size of the queue
    public int size() {
        return size;
    }

    public static void main(String[] args) {
        QueueUsingArray queue = new QueueUsingArray(5); // Create a queue of capacity 5

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println("Dequeue: " + queue.dequeue()); // Outputs 10
        System.out.println("Peek: " + queue.peek());       // Outputs 20

        queue.enqueue(40);
        queue.enqueue(50);
        queue.enqueue(60);

        System.out.println("Size: " + queue.size());       // Outputs 5
        // queue.enqueue(70);
        
        System.out.println("Dequeue: " + queue.dequeue()); // Outputs 20
        System.out.println("Dequeue: " + queue.dequeue()); // Outputs 30
        System.out.println("Dequeue: " + queue.dequeue()); // Outputs 40
        // System.out.println("Dequeue: " + queue.dequeue());
    }
}

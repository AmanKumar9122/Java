public class LLImplementation {
    public static class Node { // user defined data type
        int val;
        Node next;
        Node(int val) {
            this.val = val;
        }
    }
    public static class LLStack { // user defined data structure

        private Node head = null;
        private int size = 0;
        void push(int x) {
            Node temp = new Node(x);
            temp.next = head;
            head = temp;
            size++;
        }
        int pop() {
            if (head == null) {
                System.out.println("Stack is Empty!");
                return -1;
            }
            int x = head.val;
            head = head.next;
            size--;
            return x;
        }
        int peek() {
            if (head == null) {
                System.out.println("Stack is Empty!");
                return -1;
            }
            return head.val;
        }
        void displayrec(Node h){
            if(h==null) return;
            displayrec(h.next);
            System.out.print(h.val+" ");
        }
        void display(){
            displayrec(head);
            System.out.println();
        }
        void revDisplay() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.val + " ");
                temp = temp.next;
            }
            System.out.println();
        }
        int size() {
            return size;
        }
        boolean isEmpty() {
            return size == 0;
        }
        boolean isFull() {
        return false;
        }
    }
    public static void main(String[] args) {
        LLStack st = new LLStack();
        st.push(4);
        st.push(5);
        st.push(1);
        st.display(); // 4 5 1
        System.out.println(st.size()); // 3
        st.pop();
        System.out.println(st.peek()); // 5
        st.display(); // 4 5
        System.out.println(st.isFull()); // Assuming linked list implementation, it's never full
        System.out.println(st.isEmpty());
    }
}

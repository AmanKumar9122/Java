public class ReverseSLL {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static class LinkedList{
        Node head=null;
        Node tail=null;
        void insertAtEnd(int val){
            Node temp = new Node(val);
            if(head==null){
                head=temp;
            }
            else{
                tail.next=temp;
            }
            tail=temp;
        }
        void display(){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }
        void printReverse() {
            Node current = head;
            Node prev = null;
            Node next = null;
    
            while (current != null) {
                next = current.next;
                current.next = prev;
                prev = current;
                current = next;
            }
    
            Node reversedHead = prev;
    
            Node temp = reversedHead;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.insertAtEnd(2);
        l.insertAtEnd(5);
        l.insertAtEnd(9);
        l.insertAtEnd(8);
        l.display();
        l.printReverse();

    }
}

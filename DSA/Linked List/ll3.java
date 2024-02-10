/**
 * ll3
 */
// removing size function due to O(n) time complexity
public class ll3 {
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
        int size=0;
        void insertAtEnd(int val){
            //O(1) -> if tail is given
            //O(1) -> if head is given
            Node temp = new Node(val);
            if(head==null){
                head=temp;
            }
            else{
                tail.next=temp;
            }
            tail=temp;
            size++;
        }
        int getAt(int idx){
            if(idx<0 || idx>size){
                System.out.println("Wrong Index");
                return -1;
            }
            Node temp = head;
            for(int i=1;i<idx;i++){
                temp=temp.next;
            }
            return temp.data;
        }
        void deleteAt(int idx){
            if(idx==0){
            head=head.next;
            size--;
            return;
            }
            Node temp = head;
            for(int i=1;i<idx-1;i++){
                temp=temp.next;
            }
            temp.next = temp.next.next;
            tail=temp;
            size--;
        }
        void display(){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }
        void insertAt(int idx,int val){
            Node t = new Node(val);
            Node temp = head;
// this line solved the problem of tail data now we get 80 instead of 12 as tail value
            if(idx==size){ 
                insertAtEnd(val);
                return;
            }
// else if statement will solve the problem of head part
            else if(idx==0){
                insertAtHead(val);
                return;
            }
// if someone is providing wrong values 
            else if(idx<0 || idx>size){
                System.out.println("Wrong Index");
                return;
            }
            for(int i=1;i<=idx-1;i++){
                temp = temp.next;
            }
            t.next=temp.next;
            temp.next=t;
            size++;
        }
        void insertAtHead(int val){
            Node temp = new Node(val); 
            if(head==null){ //empty list
                insertAtEnd(val);   
                //or  head= tail=temp;
            }
            else{ // non empty list
                temp.next = head;
                head = temp;
            }
            size++;
        }
    }
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insertAtEnd(4);
        //ll.display();
        ll.insertAtEnd(5);
        //ll.display(); 
        ll.insertAtEnd(12);
        //ll.display();
        ll.insertAtHead(13);
        //ll.display();
        ll.insertAt(3,20);
        ll.display();
        ll.insertAt(5,80);
        ll.display();
        System.out.println(ll.head.data);
        System.out.println(ll.tail.data); //wrong data
// tail should be 80 but it is 12
        ll.insertAt(0,15);
        ll.display();// 13 15 4 5 20 12 80
        System.out.println(ll.head.data); 
// here we should get 15 at 0 index but we are getting it at 1 index
         System.out.println(ll.getAt(5));
        System.out.println(ll.getAt(-8));
        System.out.println(ll.size);
        ll.deleteAt(4);
        ll.display();
        ll.deleteAt(6);
        ll.display();
        System.out.println(ll.tail.data);
    }
}
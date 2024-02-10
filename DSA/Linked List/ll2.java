/**
 * ll2
 */
public class ll2 {
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
        int getAt(int idx){
            if(idx<0 || idx>size()){
                System.out.println("Wrong Index");
                return -1;
            }
            Node temp = head;
            for(int i=1;i<idx;i++){
                temp=temp.next;
            }
            return temp.data;
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
            if(idx==size()){ 
                insertAtEnd(val);
                return;
            }
// else if statement will solve the problem of head part
            else if(idx==0){
                insertAtHead(val);
                return;
            }
// if someone is providing wrong values 
            else if(idx<0 || idx>size()){
                System.out.println("Wrong Index");
                return;
            }
            for(int i=1;i<=idx-1;i++){
                temp = temp.next;
            }
            t.next=temp.next;
            temp.next=t;
        }
        int size(){ //O(n) if head is given 
            //O(1) if ll class is there 
             Node temp = head;
             int count = 0;
            while(temp!=null){
                count++;
                temp=temp.next;
            }
            return count;
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
        }
    }
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insertAtEnd(4);
        //ll.display();
        ll.insertAtEnd(5);
        //ll.display(); 
        //System.out.println(ll.size());
        ll.insertAtEnd(12);
        //ll.display();
        ll.insertAtHead(13);
        //ll.display();
        ll.insertAt(3,20);
        //ll.display();
        ll.insertAt(5,80);
        //ll.display();
        //System.out.println(ll.head.data);
        //System.out.println(ll.tail.data); //wrong data
// tail should be 80 but it is 12
        ll.insertAt(0,15);
        ll.display();// 13 15 4 5 20 12 80
        //System.out.println(ll.head.data); 
// here we should get 15 at 0 index but we are getting it at 1 index
        //System.out.println(ll.getAt(5));
        //System.out.println(ll.getAt(-8));
        
    }
}
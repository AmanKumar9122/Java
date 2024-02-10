/**
 * ll1
 */
public class ll1 {  
    public static void insertAtEnd(Node head,int val){
        Node temp =new Node(val);
        Node t = head;
        while(t.next!=null){
            t=t.next;
        }
        t.next=temp;
    }
    
    //displaying recursively
    public static void displayr(Node head){
        if(head==null) return;
        System.out.print(head.data+"->");
        displayr(head.next);
    }
    public static void displayrr(Node head){
        if(head==null) return;
        displayrr(head.next);
        System.out.print(head.data+"->");
    }

    //function for displaying a linked list 
    public static void display(Node head){
        Node temp = head;
        while(temp!=null){ //printing the list 
            System.out.print(temp.data+"->");// 5 3 9 8 16
            temp=temp.next;
        }
    }

    //function to find the length of node
    public static int length(Node head){
        int count = 0;
        while(head!=null){
            count++;
            head=head.next;
        }
        return count;
}
    public static class Node{
        int data;//value
        Node next;//address of next node 
        Node(int data){
            this.data=data;
        }
    }
    public static void main(String[] args) {
       Node a = new Node(5); //head node
    //   System.out.println(a.next); //null
       Node b = new Node(3);
       Node c = new Node(9);
       Node d = new Node(8);
       Node e = new Node(16);
       //5->3->9->8->16 
       a.next=b;//5->3  9  8  16
       b.next=c;//5->3->9  8  16
       c.next=d;//5->3->9->8  16
       d.next=e;//5->3->9->8->16
    
    //    System.out.println(a);//ll1$Node@28a418fc
    //    System.out.println(a.next); //ll1$Node@5305068a
    //    System.out.println(b); //ll1$Node@5305068a
    
    
    // displaying next node value with the help of head  
        
    
    // System.out.println(a.data);
        // System.out.println(a.next.data);
        // System.out.println(a.next.next.data);
        // System.out.println(a.next.next.next.data);
        // System.out.println(a.next.next.next.next.data);
        Node temp = a;
        // System.out.println(a.data);
        // System.out.println(temp.data);


        // for(int i=1;i<=5;i++){
        //     System.out.print (temp.data+"->");
        //     temp= temp.next;
        // }


        // while(temp!=null){ //printing the list 
        //     System.out.print(temp.data+"->");// 5 3 9 8 16
        //     temp=temp.next;
        // }

        //display(a);
        // System.out.println();
        // displayr(a);
        //System.out.println();
        displayrr(a);
        //System.out.println();
        //System.out.println(length(a));
        //insertAtEnd(a, 87);
        //display(a);
    }
}
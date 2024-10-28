// public class arrayimplementation1 {
//     public static class stack1{
//         int arr[] = new int[5];
//         int idx = 0;
//         //function for pushing values in stack
//         void push(int x){
//             if(arr.length==idx){
//                 System.out.println("Stack is Full");
//             }
//             arr[idx]=x;
//             idx++;
//         }
//         int peek(){
//             if(idx==0){
//                 System.out.println("Stack is Empty");
//             }
//             return arr[idx-1];
//         }
//         int pop(){
//             if(idx==0){
//                 System.out.println("Stack is Empty");
//                 return -1;
//             }
//             int top = arr[idx-1];
//             arr[idx-1]=0;
//             idx--;
//             return top;
//         }
//         void display(){
//             for(int i=0;i<idx;i++){
//                 System.out.print(arr[i]+" ");
//             }
//         }
//     }
//     public static void main(String[] args) {
//         stack1 st = new stack1();
//         st.push(5);
//         st.push(9);
//         st.push(14);
//         st.display();
//         System.out.println();
//         System.out.println(st.peek());
//         System.out.println(st.pop());
        
//     }   
// }
 
public class Stack {
    public int top;
    public int[] arr;
    public int capacity;

    public Stack(int capacity) {
        this.top = -1;
        this.capacity = capacity;
        this.arr = new int[capacity];
    }

    public void push(int item) {
        if (top == capacity - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        arr[++top] = item;
    }

    public int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return arr[top--];
    }

    public int peek() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return arr[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Top element: " + stack.peek());

        while (!stack.isEmpty()) {
            System.out.println("Popped: " + stack.pop());
        }
    }
}

public class arrayimplementation1 {
    public static class stack1{
        int arr[] = new int[5];
        int idx = 0;
        //function for pushing values in stack
        void push(int x){
            if(arr.length==idx){
                System.out.println("Stack is Full");
            }
            arr[idx]=x;
            idx++;
        }
        int peek(){
            if(idx==0){
                System.out.println("Stack is Empty");
            }
            return arr[idx-1];
        }
        int pop(){
            if(idx==0){
                System.out.println("Stack is Empty");
                return -1;
            }
            int top = arr[idx-1];
            arr[idx-1]=0;
            idx--;
            return top;
        }
        void display(){
            for(int i=0;i<idx;i++){
                System.out.print(arr[i]+" ");
            }
        }
    }
    public static void main(String[] args) {
        stack1 st = new stack1();
        st.push(5);
        st.push(9);
        st.push(14);
        st.display();
        System.out.println();
        System.out.println(st.peek());
        System.out.println(st.pop());
        
    }
    
}

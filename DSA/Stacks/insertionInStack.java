import java.util.Stack;

public class insertionInStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(23);
        st.push(90);
        st.push(5);
        st.push(34);
        System.out.println(st);
        int idx = 2;
        int x = 12;
        Stack<Integer> temp = new Stack<>();
        while(st.size()>idx){
            temp.push(st.pop());
        }
        st.push(x);
        while(temp.size()>0){
            st.push(temp.pop());
        }
        System.out.println(st);
    }
    
}

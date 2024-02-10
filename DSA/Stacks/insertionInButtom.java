import java.util.Stack;

/**
 * insertionInButtom
 */
public class insertionInButtom {
    public static void pushAtButtom(Stack<Integer> st,int x){
        if(st.size()==0){
            st.push(x);
            return;
        }
        int top = st.pop();
        pushAtButtom(st, x);
        st.push(top);
    }
    public static void reverse(Stack<Integer> st){
        if(st.size()==0) return;
        int top = st.pop();
        System.out.println(top+" ");
        reverse(st);
        pushAtButtom(st, top);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println(st);
        pushAtButtom(st, 7);
        System.out.println(st);
    }
}
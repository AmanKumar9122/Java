import java.util.Stack;

public class displayStackRec{
    public static void displayReverseRec(Stack<Integer> st){
        if(st.size()==0) return;
        int top = st.pop();
        System.out.println(top+" ");
        displayReverseRec(st);
        st.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(23);
        st.push(90);
        st.push(5);
        st.push(34);
        displayReverseRec(st);
        System.out.println(st);
     }
    }

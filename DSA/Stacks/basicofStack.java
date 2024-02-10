import java.util.Stack;

public class basicofStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        System.out.println(st.isEmpty());
        System.out.println(st);
        System.out.println("size is:"+st.size());
        st.push(1);
        st.push(23);
        st.push(90);
        st.push(5);
        st.push(34);
        //peek
        System.out.println(st.peek());
        System.out.println(st);
        st.pop();
        System.out.println(st);
        st.pop();
        System.out.println(st);
        System.out.println("size is:"+st.size());
        System.out.println(st.isEmpty());

    }
    
}

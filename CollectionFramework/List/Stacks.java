import java.util.Stack;

public class Stacks {
    static void StackExamples(){
        Stack<String> st= new Stack<>();
        st.push("pw");
        st.push("skills");
        System.out.println(st.peek());
        System.out.println(st.pop());
        System.out.println(st.peek());
        System.out.println(st.size());
        System.out.println(st.empty());
    }
    public static void main(String[] args) {
        StackExamples();
    }
    
}

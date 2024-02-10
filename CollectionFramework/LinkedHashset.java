import java.util.*;

public class LinkedHashset {
    public static void main(String[] args) {
        LinkedHashSet<Integer> st = new LinkedHashSet<>();
        st.add(1);
        st.add(2);
        st.add(3);
        System.out.println(st);
        st.add(1);
        st.add(1);
        st.add(2);
        st.add(48);
        st.add(15);
        System.out.println(st);
        st.remove(2);
        System.out.println(st.contains(2));
        System.out.println(st.size());
    }
    
}

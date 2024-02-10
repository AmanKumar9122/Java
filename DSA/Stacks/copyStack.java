import java.util.Scanner;
import java.util.Stack;

public class copyStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        int n;
        System.out.println("Enter the number of elements:");
        n = sc.nextInt();
        System.out.println("Enter the Elements: ");
        for(int i=0;i<n;i++){
            int x = sc.nextInt();
            st.push(x);
        }
        System.out.println("Stack Element:"+st);
        //reverse order
        Stack<Integer> gt =new Stack<>();
        while(st.size()>0){
            gt.push(st.pop());
        }
        System.out.println(gt);
        Stack<Integer> rt =new Stack<>();
        while(gt.size()>0){
            rt.push(gt.pop());
        }
        System.out.println(rt);
    }
}

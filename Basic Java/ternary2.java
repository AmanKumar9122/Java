public class ternary2 {
    public static void main(String[] args) {
        int a=20;
        int b=30;
        int c=40;
        int result=(a<b)? (a<c? a:c) : (b<c? b:c);
        System.out.println(result);
    }    
}
//shortcut of if else condition 
//if statement is true then the thing before : will be shown on the screen otherwise vise versa
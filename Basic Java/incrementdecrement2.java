public class incrementdecrement2 {
    public static void main(String[] args) {
        int a = 5;
        int b;
        b = a++ + ++a + ++a  + a++ + --a + a--;
        System.out.println(a);//7
        System.out.println(b);//44
    }
    
}

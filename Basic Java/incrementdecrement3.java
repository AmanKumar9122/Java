public class incrementdecrement3 {
    public static void main(String[] args) {
        int a = 8;
        int b;
        b = a++ + ++a + ++a  + a++ + --a + a-- + a-- - a++ - a--;
        System.out.println(a);//9
        System.out.println(b);//53
    } 
}

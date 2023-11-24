public class reversestring {
    public static void main(String[] args) {
        StringBuilder str1= new StringBuilder("Think");
        str1=str1.reverse();
        StringBuilder str2= new StringBuilder("Twice ");
        str2=str2.reverse();
        System.out.println(str1.append(str2));
    }
}
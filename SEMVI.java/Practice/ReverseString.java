public class ReverseString {
    public String reverse(String str){
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }
    public static void main(String[] args) {
        String str = "Java";
        ReverseString obj = new ReverseString();
        str = obj.reverse(str);
        System.out.println(str);
    }
}
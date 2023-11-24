public class waystocomparestring {
    public static void main(String[] args) {
        String s1="Aman";
        String s2= new String("Aman");
        System.out.println(s1==s2);//it compare reference of the object
        System.out.println(s1.equals(s2));//it compares the content of two object
    }
}

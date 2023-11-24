public class q11 {

    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";

        int comparison = str1.compareTo(str2);

        if (comparison == 0) {
            System.out.println("Strings are lexicographically equal.");
        } else if (comparison < 0) {
            System.out.println("String 1 is lexicographically before String 2.");
        } else {
            System.out.println("String 1 is lexicographically after String 2.");
        }
    }
}
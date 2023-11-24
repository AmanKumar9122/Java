public class q19 {

    public static void checkEvenOdd(int number) throws IllegalArgumentException {
        if (number % 2 != 0) {
            throw new IllegalArgumentException("The number is odd");
        }
    }

    public static void main(String[] args) {
        try {
            checkEvenOdd(10);
            System.out.println("The number is even");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
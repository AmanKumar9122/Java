class q33 {
    public static void checkEvenNumber(int number) throws IllegalArgumentException {
        if (number % 2 != 0) {
            throw new IllegalArgumentException("The number " + number + " is odd.");
        }
    }

    public static void main(String[] args) {
        try {
            checkEvenNumber(10);
            System.out.println("The number is even.");
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }

        try {
            checkEvenNumber(7);
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
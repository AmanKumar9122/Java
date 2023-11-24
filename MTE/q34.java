class UnderageForVotingException extends Exception {
    public UnderageForVotingException(String message) {
        super(message);
    }
}

public class q34 {

    public static void checkVotingEligibility(int age) throws UnderageForVotingException {
        if (age < 18) {
            throw new UnderageForVotingException("You are not eligible to vote. Minimum voting age is 18.");
        }
    }

    public static void main(String[] args) {
        try {
            checkVotingEligibility(16);
        } catch (UnderageForVotingException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
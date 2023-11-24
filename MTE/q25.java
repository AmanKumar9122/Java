public class q25 {

    public static boolean checkSubstringBeforePeriod(String str, String substring) {
        int indexOfPeriod = str.indexOf('.');
        if (indexOfPeriod == -1) {
            return false; // No period found in the string
        }

        int indexOfSubstring = str.indexOf(substring);
        return indexOfSubstring != -1 && indexOfSubstring < indexOfPeriod; // Substring found before the period
    }

    public static void main(String[] args) {
        String str = "Hello, world. How are you?";
        String substring = "world";

        if (checkSubstringBeforePeriod(str, substring)) {
            System.out.println("The substring '" + substring + "' appears before a period in the string '" + str + "'");
        } else {
            System.out.println("The substring '" + substring + "' does not appear before a period in the string '" + str + "'");
        }
    }
}
import java.util.regex.*;
import java.util.*;

public class LexicalAnalyzer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String code = sc.nextLine();

        // Define token patterns
        String tokenPatterns = 
            "(?<KEYWORD>\\b(int|float|if|else|while|for|return)\\b)|" +
            "(?<IDENTIFIER>[a-zA-Z_][a-zA-Z0-9_]*)|" +
            "(?<NUMBER>\\b\\d+(\\.\\d+)?\\b)|" +
            "(?<OPERATOR>[+\\-*/=<>])|" +
            "(?<SEPARATOR>[;{}()])";

        Pattern pattern = Pattern.compile(tokenPatterns);
        Matcher matcher = pattern.matcher(code);

        System.out.println("Token\t\tType");
        System.out.println("-------------------------");

        while (matcher.find()) {
            if (matcher.group("KEYWORD") != null) {
                System.out.println(matcher.group("KEYWORD") + "\t\tKEYWORD");
            } else if (matcher.group("IDENTIFIER") != null) {
                System.out.println(matcher.group("IDENTIFIER") + "\t\tIDENTIFIER");
            } else if (matcher.group("NUMBER") != null) {
                System.out.println(matcher.group("NUMBER") + "\t\tNUMBER");
            } else if (matcher.group("OPERATOR") != null) {
                System.out.println(matcher.group("OPERATOR") + "\t\tOPERATOR");
            } else if (matcher.group("SEPARATOR") != null) {
                System.out.println(matcher.group("SEPARATOR") + "\t\tSEPARATOR");
            }
        }
    }
}
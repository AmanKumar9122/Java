import java.util.Arrays;
import java.util.Scanner;
public class sortingalphabetically {
    public static void main(String[] args) {
        String s;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        s=sc.nextLine();
        char charArray[] = s.toCharArray();
        Arrays.sort(charArray);
        System.out.println(new String(charArray));
    }
}

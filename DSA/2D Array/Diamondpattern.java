    public class Diamondpattern {

        public static void main(String[] args) {
            int n = 5; // Change this value to adjust the size of the pattern
    
            // Upper half of the diamond
            for (int i = 1; i <= n; i++) {
                for (int j = i; j <= n; j++) {
                    System.out.print(j);
                }
                for (int j = 1; j < i * 2; j++) {
                    System.out.print(" ");
                }
                for (int j = n - i + 1; j >= 1; j--) {
                    System.out.print(j);
                }
                System.out.println();
            }
    
            // Lower half of the diamond (excluding the center line)
            for (int i = n - 1; i >= 1; i--) {
                for (int j = i; j <= n; j++) {
                    System.out.print(j);
                }
                for (int j = 1; j < i * 2; j++) {
                    System.out.print(" ");
                }
                for (int j = n - i + 1; j >= 1; j--) {
                    System.out.print(j);
                }
                System.out.println();
            }
        }
    }
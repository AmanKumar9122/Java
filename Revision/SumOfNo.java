public class sumOfno {
    public void Sum(int i, int sum) {
        if (i < 1) {
            System.out.println(sum);
            return;
        }
        Sum(i - 1, sum + i);
    }
    
    public static void main(String[] args) {
        sumOfno obj = new sumOfno();
        obj.Sum(5, 0);
    }
}
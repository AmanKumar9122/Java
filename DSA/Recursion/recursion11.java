// tiling problem 
public class recursion11 {
    public static int tile(int n) {
        if(n==0||n==1){
            return 1;
        }
        int totalways = tile(n-1) + tile(n-2);
        //n-1 if tiles are placed vertically
        //n-2 if tiles are placed horigontally
        return totalways;   
    }
    public static void main(String[] args) {
        System.out.println(tile(4));
    }
}

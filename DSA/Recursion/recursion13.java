public class recursion13 {
    public static int friendspairing(int n){
        if(n==1||n==2){
            return n;
        }
        return friendspairing(n-1)*(n-1)*friendspairing(n-2);
    }
    public static void main(String[] args) {
        System.out.println(friendspairing(4));
    }
}

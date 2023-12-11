//time complexity =O(n^2)
public class pairinanarray {
    public static void pair(int num[]){
        int pr=0;
        for(int i=0;i<num.length;i++){
            int curr = num[i];
            for(int j=i+1;j<num.length;j++){
                System.out.print("("+ curr + "," + num[j] +")");
                pr++;
            }
            System.out.println();
        }
        System.out.println("Total no. of pair: " +pr);
    }
    public static void main(String[] args) {
        int num[]={2,4,6,8,10};
        pair(num);
    }
    
}

public class pp31 {
    static int n1=0,n2=1,n3=0;  
    public static int printFibonacci(int count){    
        if(count>0){    
             n3 = n1 + n2;    
             n1 = n2;    
             n2 = n3;    
             System.out.print(" "+n3);   
            printFibonacci(count-1); 
          }
        return count;    
     }    
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                    System.out.print(printFibonacci(n)+" ");
                }
            System.out.println();
        }
    }
}
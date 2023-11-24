//2d array
public class array4 {
    public static void main(String[] args) {
        int a [][]= new int[3][3];
        a[0][0]= 5;
        a[0][1]= 3;
        a[0][2]= 2;
        a[1][0]= 1;
        a[1][1]= 8;
        a[1][2]= 9;
        a[2][0]= 6;
        a[2][1]= 4;
        a[2][2]= 7;
        for(int i=0;i<=2;i++){
            for (int j=0;j<=2;j++){
            System.out.print(a[i][j]+ " ");
            }
            System.out.println();
        }
    }  
}
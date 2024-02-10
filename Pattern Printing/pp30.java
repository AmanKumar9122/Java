public class pp30
{
    public static void main(String[] args)
    { 
        int rows=5;
        for (int i=0; i<rows; i++){
            for (int j=0; j<=i; j++){
                System.out.print((char) (65+j) + " ");
            }
            System.out.println();
        } 
    }
}
// A 
// A B 
// A B C 
// A B C D
// A B C D E
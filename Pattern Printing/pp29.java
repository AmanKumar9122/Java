public class pp29
{
    public static void main(String[] args)
    { 
        int rows=5;
        System.out.println("Here is your pattern....!!!");
        int alphabet = 65; 
        for (int i=0; i<rows; i++){
            for (int j=0; j<=i; j++){
                System.out.print((char) (alphabet) + " ");    
            }
            alphabet++;
            System.out.println();
        } 
    }
}
// A 
// B B 
// C C C 
// D D D D 
// E E E E E
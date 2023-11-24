import java.util.Scanner;
//using static keyword to form a single memory  of that variable in heap.....
class Farmer{
    float pa;
    float td;
    float si;
    static float ri;
    static{
        ri=2.5f;
    }
    public void acceptInput(){
        Scanner scan= new Scanner(System.in);
        System.out.println("Dear,kindly enter loan amount needed");
        pa=scan.nextInt();
        System.out.println("Dear,kindly enter time needed to repay");
        td=scan.nextFloat();
    }
    public void compute(){
        si=(pa*td*ri)/100;
    }
    public void disp(){
        System.out.println("Si is " +si);
    }
}
public class farmerloanapplication {
    public static void main(String[] args) {
        Farmer f1= new Farmer();
        Farmer f2= new Farmer();
        
        f1.acceptInput();
        f1.compute();
        f1.disp();

        f2.acceptInput();
        f2.compute();
        f2.disp();
    }
}
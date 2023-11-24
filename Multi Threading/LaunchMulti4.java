import java.util.*;
class Calc extends Thread {
    public void run(){
    System.out.println("Calculator Task Started");

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter first number");
        int num1= sc.nextInt();
        System.out.println("Please enter second number");
        int num2 =sc.nextInt();

        int res= num1+num2;
        System.out.println(res);
        System.out.println("Calculator Task Ended");

        System.out.println("*****************");
    }
}
class Message extends Thread{
    public void run(){
        System.out.println("Focus is important to message task");
        try{
            for(int i=0;i<3;i++){
                System.out.println("Focus is important to master skills");
                Thread.sleep(2000);
            }
        }
        catch(Exception e)
        {
            System.out.println("Some Problem");
        }
        System.out.println("Display import message task ended");
    }
}
public class LaunchMulti4{
    public static void main(String[] args) {
        System.out.println("Main Thread started");

        Calc t1= new Calc();
        Message t2 = new Message();

        t1.start();
        t2.start();
    }
}

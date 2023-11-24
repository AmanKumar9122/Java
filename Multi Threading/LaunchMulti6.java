import java.util.Scanner;

class MyThread1 extends Thread{
    public void run(){
        String tName = Thread.currentThread().getName();
        if(tName.equals("CALC")){
            calc();
        }
        else{
            importantMesg();
        }
    }
    public void calc()
    {
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
    public void importantMesg()
    {
        System.out.println("Display important message task");
        try{
            for (int i=0;i<3;i++)
            {
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
public class LaunchMulti6 {
    public static void main(String[] args) {
        System.out.println("Main Thread started");
        MyThread1 thread1=new MyThread1();
        MyThread1 thread2=new MyThread1();

        thread1.setName("CALC");
        thread2.setName("PRINT");

        thread1.start();
        thread2.start();
    }
    
}

class MyThread extends Thread{
    public void run()
    {
        System.out.println("Child Thread");
    }
}
public class LaunchMulti3 {
    public static void main(String[] args) {
        System.out.println("Multi Thread");

        MyThread t = new MyThread();
        t.start();
    }   
}

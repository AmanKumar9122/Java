import java.util.concurrent.locks.ReentrantLock;

public class q14 {

    private int balance;
    private final ReentrantLock lock = new ReentrantLock();

    public q14(int initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(int amount) {
        lock.lock();
        try {
            balance += amount;
            System.out.println("Deposited: " + amount + "; Balance: " + balance);
        } finally {
            lock.unlock();
        }
    }

    public void withdraw(int amount) {
        lock.lock();
        try {
            if (balance >= amount) {
                balance -= amount;
                System.out.println("Withdrawn: " + amount + "; Balance: " + balance);
            } else {
                System.out.println("Insufficient funds. Withdrawal cancelled.");
            }
        } finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        q14 account = new q14(1000);

        Thread depositThread1 = new Thread(() -> account.deposit(500));
        Thread depositThread2 = new Thread(() -> account.deposit(300));
        Thread withdrawalThread1 = new Thread(() -> account.withdraw(200));
        Thread withdrawalThread2 = new Thread(() -> account.withdraw(400));

        depositThread1.start();
        depositThread2.start();
        withdrawalThread1.start();
        withdrawalThread2.start();

        try {
            depositThread1.join();
            depositThread2.join();
            withdrawalThread1.join();
            withdrawalThread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final balance: " + account.balance);
    }
}
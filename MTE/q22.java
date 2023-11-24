import java.util.Scanner;
class LessBalanceException extends Exception{
public LessBalanceException(String message){
        super(message);
    }
}
class Account {
    public int balance;
    public Account() {
        this.balance = 500;
    }

    public void deposit(int amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Amount deposited: " + amount);
            System.out.println("Current balance: " + this.balance);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    public void withdraw(int amount) throws LessBalanceException {
        if (amount > 0) {
            if (this.balance >= amount) {
                this.balance -= amount;
                System.out.println("Amount withdrawn: " + amount);
                System.out.println("Current balance: " + this.balance);
            } else {
                throw new LessBalanceException("Insufficient balance");
            }
        } else {
            System.out.println("Invalid withdrawal amount");
        }
    }
}

public class q22 {
    public static void main(String[] args) {
        Account account = new Account();

        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("\nSelect an option:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Enter the amount to deposit: ");
                    int depositAmount = scanner.nextInt();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter the amount to withdraw: ");
                    int withdrawAmount = scanner.nextInt();
                    try {
                        account.withdraw(withdrawAmount);
                    } catch (LessBalanceException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    System.out.println("Current balance: " + account.balance);
                    break;
                case 4:
                    System.out.println("Thank you for using the banking system.");
                    break;
                default:
                    System.out.println("Invalid option");
            }
        } while (option != 4);
    }
}
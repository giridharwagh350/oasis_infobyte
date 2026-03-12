import java.util.*;

public class task3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int userId = 1234;
        int pin = 1111;

        System.out.print("Enter User ID: ");
        int id = sc.nextInt();

        System.out.print("Enter PIN: ");
        int userPin = sc.nextInt();

        if(id == userId && userPin == pin) {
            System.out.println("Login Successful");

            int balance = 10000;

            while(true) {
                System.out.println("\n1. Withdraw");
                System.out.println("2. Deposit");
                System.out.println("3. Check Balance");
                System.out.println("4. Quit");

                System.out.print("Choose option: ");
                int choice = sc.nextInt();

                switch(choice) {

                    case 1:
                        System.out.print("Enter amount: ");
                        int withdraw = sc.nextInt();
                        balance -= withdraw;
                        System.out.println("Withdraw Successful");
                        break;

                    case 2:
                        System.out.print("Enter amount: ");
                        int deposit = sc.nextInt();
                        balance += deposit;
                        System.out.println("Deposit Successful");
                        break;

                    case 3:
                        System.out.println("Balance: " + balance);
                        break;

                    case 4:
                        System.out.println("Thank you for using ATM");
                        System.exit(0);
                }
            }

        } else {
            System.out.println("Invalid Login");
        }
    }
}
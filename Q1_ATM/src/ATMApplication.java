import java.util.Scanner;

public class ATMApplication {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ATM atm = new ATM();

        try {

            System.out.print("Enter PIN: ");
            int pin = sc.nextInt();

            atm.verifyPin(pin);

            int choice;

            do {

                System.out.println("\n----- ATM MENU -----");
                System.out.println("1. Check Balance");
                System.out.println("2. Deposit");
                System.out.println("3. Withdraw");
                System.out.println("4. Exit");
                System.out.print("Enter your choice: ");

                choice = sc.nextInt();

                try {

                    switch (choice) {

                        case 1:
                            atm.checkBalance();
                            break;

                        case 2:
                            System.out.print("Enter deposit amount: ");
                            double deposit = sc.nextDouble();
                            atm.deposit(deposit);
                            break;

                        case 3:
                            System.out.print("Enter withdrawal amount: ");
                            double withdraw = sc.nextDouble();
                            atm.withdraw(withdraw);
                            break;

                        case 4:
                            System.out.println("Thank you for using ATM.");
                            break;

                        default:
                            System.out.println("Invalid choice.");
                    }

                } catch (InvalidAmountException |
                         InsufficientBalanceException e) {

                    System.out.println("Error: " + e.getMessage());
                }

            } while (choice != 4);

        } catch (InvalidPinException e) {

            System.out.println("Error: " + e.getMessage());

        } finally {

            System.out.println("ATM transaction completed.");
            sc.close();
        }
    }
}
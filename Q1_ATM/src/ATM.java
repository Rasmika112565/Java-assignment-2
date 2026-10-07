public class ATM {

    private int pin = 1234;
    private double balance = 10000;
    private double withdrawalLimit = 5000;

    public void verifyPin(int enteredPin) throws InvalidPinException {

        if (enteredPin != pin) {
            throw new InvalidPinException("Invalid PIN!");
        }

        System.out.println("PIN verified successfully.");
    }

    public void checkBalance() {
        System.out.println("Current Balance: Rs." + balance);
    }

    public void deposit(double amount) throws InvalidAmountException {

        if (amount <= 0) {
            throw new InvalidAmountException(
                    "Deposit amount must be greater than 0.");
        }

        balance = balance + amount;

        System.out.println("Amount deposited: Rs." + amount);
        System.out.println("New Balance: Rs." + balance);
    }

    public void withdraw(double amount)
            throws InvalidAmountException,
            InsufficientBalanceException {

        if (amount <= 0) {
            throw new InvalidAmountException(
                    "Withdrawal amount must be greater than 0.");
        }

        if (amount > withdrawalLimit) {
            throw new InvalidAmountException(
                    "Withdrawal limit is Rs.5000.");
        }

        if (amount > balance) {
            throw new InsufficientBalanceException(
                    "Insufficient balance!");
        }

        balance = balance - amount;

        System.out.println("Amount withdrawn: Rs." + amount);
        System.out.println("Remaining Balance: Rs." + balance);
    }
}
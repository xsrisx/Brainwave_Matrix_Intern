import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ATM implements ATMInterface {

    private static final int DEFAULT_PIN = 1234; // Default PIN
    private static int balance = 10000; // Default balance
    private static List<String> transactionHistory = new ArrayList<>();
    private static int pin = DEFAULT_PIN;

    @Override
    public void withdraw(Scanner scanner) {
        System.out.println("Please select your account type:");
        System.out.println("1. Current");
        System.out.println("2. Savings");
        System.out.println("3. Credit");
        int accountType = scanner.nextInt();

        System.out.print("Enter amount to withdraw: Rs. ");
        int amount = scanner.nextInt();

        System.out.print("Enter your 4-digit PIN: ");
        int enteredPin = scanner.nextInt();

        if (enteredPin == pin) {
            if (amount > 0 && amount <= balance) {
                balance -= amount;
                transactionHistory.add("Withdrawn: Rs. " + amount + " from account type " + accountType);
                System.out.println("Amount withdrawn: Rs. " + amount);
                System.out.println("Do you want a receipt? (yes/no)");
                scanner.nextLine(); // Consume newline
                String receiptOption = scanner.nextLine();
                if (receiptOption.equalsIgnoreCase("yes")) {
                    printReceipt(amount, accountType);
                }
            } else {
                System.out.println("Insufficient balance or invalid amount.");
            }
        } else {
            System.out.println("Incorrect PIN.");
        }
    }

    @Override
    public void checkBalance() {
        System.out.println("Your balance is: Rs. " + balance);
    }

    @Override
    public void miniStatement() {
        System.out.println("Mini Statement:");
        if (transactionHistory.isEmpty()) {
            System.out.println("No transactions found.");
        } else {
            for (String transaction : transactionHistory) {
                System.out.println(transaction);
            }
        }
    }

    @Override
    public void changePin(Scanner scanner) {
        System.out.print("Enter new PIN: ");
        int newPin = scanner.nextInt();
        pin = newPin;
        System.out.println("PIN changed successfully.");
    }

    @Override
    public void transferFunds(Scanner scanner) {
        System.out.print("Enter recipient account number: ");
        String recipientAccount = scanner.next();
        System.out.print("Enter amount to transfer: Rs. ");
        int amount = scanner.nextInt();
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            transactionHistory.add("Transferred: Rs. " + amount + " to account " + recipientAccount);
            System.out.println("Amount transferred: Rs. " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    private void printReceipt(int amount, int accountType) {
        System.out.println("\n--- Receipt ---");
        System.out.println("Amount Withdrawn: Rs. " + amount);
        System.out.println("Account Type: " + (accountType == 1 ? "Current" : (accountType == 2 ? "Savings" : "Credit")));
        System.out.println("Thank you for using the ATM.");
        System.out.println("Please take your card.");
        System.out.println("---------------\n");
    }
}

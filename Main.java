import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ATMInterface atm = new ATM();

        // Step 1: Card Insertion
        cardInsertion();

        // Step 2: Main Menu
        while (true) {
            displayMenu();
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    performWithdrawal(atm, scanner);
                    break;
                case 2:
                    performBalanceEnquiry(atm);
                    break;
                case 3:
                    performMiniStatement(atm);
                    break;
                case 4:
                    performPinChange(atm, scanner);
                    break;
                case 5:
                    performTransfer(atm, scanner);
                    break;
                case 6:
                    exitATM(scanner);
                    break;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }

    private static void cardInsertion() {
        System.out.println("Please insert your card into the card holder.");
        System.out.println("Your card is being read....");
        // Simulate card reading delay
        try {
            Thread.sleep(2000); // 2 seconds delay for simulating card reading
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static void displayMenu() {
        System.out.println("\nATM Menu:");
        System.out.println("1. Withdrawal");
        System.out.println("2. Balance Enquiry");
        System.out.println("3. Mini Statement");
        System.out.println("4. PIN Change");
        System.out.println("5. Transfer");
        System.out.println("6. Exit");
        System.out.print("Select an option: ");
    }

    private static void performWithdrawal(ATMInterface atm, Scanner scanner) {
        atm.withdraw(scanner);
    }

    private static void performBalanceEnquiry(ATMInterface atm) {
        atm.checkBalance();
    }

    private static void performMiniStatement(ATMInterface atm) {
        atm.miniStatement();
    }

    private static void performPinChange(ATMInterface atm, Scanner scanner) {
        atm.changePin(scanner);
    }

    private static void performTransfer(ATMInterface atm, Scanner scanner) {
        atm.transferFunds(scanner);
    }

    private static void exitATM(Scanner scanner) {
        System.out.println("Thank you for using the ATM.");
        scanner.close();
        System.out.println("Please take your card.");
        System.exit(0);
    }
}

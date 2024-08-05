import java.util.Scanner;

public interface ATMInterface {
    void withdraw(Scanner scanner);
    void checkBalance();
    void miniStatement();
    void changePin(Scanner scanner);
    void transferFunds(Scanner scanner);
}

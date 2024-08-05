# ATM Interface Project

This project simulates an ATM (Automated Teller Machine) interface with multiple functionalities like withdrawal, balance enquiry, mini statement, PIN change, and fund transfer. The code is written in Java and includes an interface and a class implementing that interface.

## Project Structure

ATM-Interface/
│
├── src/
│   ├── ATM.java
│   ├── ATMInterface.java
│   └── Main.java
│
├── .gitignore
├── LICENSE
├── README.md


## Features

- **Card Insertion**
- **Withdrawal**
- **Balance Enquiry**
- **Mini Statement**
- **PIN Change**
- **Fund Transfer**
- **Exit**

## Prerequisites

- Java Development Kit (JDK) installed on your system.

## Compilation and Execution

1. Navigate to the `src` directory.
2. Compile the Java files:
    ```bash
    javac Main.java ATMInterface.java ATM.java
    ```
3. Run the main class:
    ```bash
    java Main
    ```

## Usage

### Card Insertion

Upon starting the application, you will be prompted to insert your card.

Please insert your card into the card holder.
Your card is being read....


### Main Menu

After card insertion, the main menu will be displayed.

ATM Menu:

1. Withdrawal
2. Balance Enquiry
3. Mini Statement
4. PIN Change
5. Transfer
6. Exit
Select an option:


### Withdrawal

To withdraw money, choose option `1`.

Please select your account type:

1. Current
2. Savings
3. Credit
Enter amount to withdraw: Rs. 500
Enter your 4-digit PIN: 1234
Amount withdrawn: Rs. 500
Do you want a receipt? (yes/no)


### Balance Enquiry

To check your balance, choose option `2`.

Your balance is: Rs. 9500


### Mini Statement

To view your mini statement, choose option `3`.

Mini Statement:
Withdrawn: Rs. 500 from account type 1


### PIN Change

To change your PIN, choose option `4`.

Enter new PIN: 4321
PIN changed successfully.


### Fund Transfer

To transfer funds, choose option `5`.

Enter recipient account number: 987654321
Enter amount to transfer: Rs. 1000
Amount transferred: Rs. 1000


### Exit

To exit the application, choose option `6`.

Thank you for using the ATM.
Please take your card.










## Example Session

Here is an example session demonstrating the usage of the ATM interface.

Please insert your card into the card holder.
Your card is being read...

ATM Menu:

1. Withdrawal
2. Balance Enquiry
3. Mini Statement
4. PIN Change
5. Transfer
6. Exit

Select an option: 1
Please select your account type:

1. Current
2. Savings
3. Credit

Enter amount to withdraw: Rs. 1000
Enter your 4-digit PIN: 1234
Amount withdrawn: Rs. 1000
Do you want a receipt? (yes/no) yes

--- Receipt ---
Amount Withdrawn: Rs. 1000
Account Type: Current

Thank you for using the ATM.
Please take your card.

ATM Menu:

1. Withdrawal
2. Balance Enquiry
3. Mini Statement
4. PIN Change
5. Transfer
6. Exit

Select an option: 2
Your balance is: Rs. 9000

ATM Menu:

1. Withdrawal
2. Balance Enquiry
3. Mini Statement
4. PIN Change
5. Transfer
6. Exit

Select an option: 6
Thank you for using the ATM.
Please take your card.
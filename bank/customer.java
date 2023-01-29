package bank;

import java.util.Scanner;

class Customer {
    private String name;
    private String username;
    private String password;
    private int age;
    private String SSN;
    private String address;
    private String email;
    private long phone;
    private float balance;

    public Customer(String name, String username, String password, int age, String SSN, String address, String email, long phone, float balance) {
        this.name = name;
        this.username = username;
        this.password = password;
        this.age = age;
        this.SSN = SSN;
        this.address = address;
        this.email = email;
        this.phone = phone;
        this.balance = balance;
    }

    public boolean login(String enteredUsername, String enteredPassword) {
        if (enteredUsername.equals(username) && enteredPassword.equals(password)) {
            System.out.println("Login successful!");
            return true;
        } else {
            System.out.println("Invalid username or password.");
            return false;
        }
    }

    public void deposit(float amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
        System.out.println("New balance: " + balance);
    }

    public void withdrawal(float amount) {
        if (balance - amount >= 0) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
            System.out.println("New balance: " + balance);
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    public void checkBalance() {
        System.out.println("Current balance: " + balance);
    }

    public void editProfile() {
        Scanner scan = new Scanner(System.in);

        System.out.println("What would you like to edit?");
        System.out.println("1. Name");
        System.out.println("2. Age");
        System.out.println("3. Address");
        System.out.println("4. Email");
        System.out.println("5. Phone");

        int choice = scan.nextInt();
        scan.nextLine();

        switch (choice) {
            case 1:
                System.out.print("Enter new name: ");
                name = scan.nextLine();
                break;
            case 2:
                System.out.print("Enter new age: ");
                age = scan.nextInt();
                scan.nextLine();
                break;
            case 3:
                System.out.print("Enter new address: ");
                address = scan.nextLine();
                break;
            case 4:
                System.out.print("Enter new email: ");
                email = scan.nextLine();
                break;
            case 5:
                System.out.print("Enter new phone: ");
                phone = scan.nextLong();
                scan.nextLine();
                break;
            default:
                System.out.println("Invalid choice.");
                break;
        }
    }

    public void changePassword(String newPassword) {
        password = newPassword;
        System.out.println("Password changed successfully!");
    }
}

class Account {
    private String accountId;
    private String description;
    private float minimumBalance;



    public Account(String accountId, String description, float minimumBalance) {
        this.accountId = accountId;
        this.description = description;
        this.minimumBalance = minimumBalance;
    }

    public void display() {
        System.out.println("Account ID: " + accountId);
        System.out.println("Description: " + description);
        System.out.println("Minimum Balance: " + minimumBalance);
    }

}

class Current extends Account {
public Current(String accountId, String description) {
super(accountId, description, 0);
}


@Override
public void display() {
    System.out.println("--- Current Account ---");
    System.out.println("Account ID: " + accountId);
    System.out.println("Description: " + description);
    System.out.println("Minimum Balance: " + minimumBalance);
}

}

class Savings extends Account {
        public Savings(String accountId, String description) {
        super(accountId, description, 1000);
        }
    }




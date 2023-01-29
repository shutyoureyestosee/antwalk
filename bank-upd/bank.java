package bank;
import java.util.Scanner;

class Bank {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    Customer customer = new Customer("Rahul", "rahulp", "password123",17, "123-45-67890", "Kolkata", "rahulp@trainee.nrifintech.com", 1234567890, 1000);
    customer.validateAge();
    customer.validateSSN();

    System.out.print("Enter username: ");
    String username = scan.nextLine();
    System.out.print("Enter password: ");
    String password = scan.nextLine();

    if (customer.login(username, password)) {
        while (true) {
            System.out.println("\nWhat would you like to do?");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check balance");
            System.out.println("4. Edit profile");
            System.out.println("5. Change password");
            System.out.println("6. Create Account");
            System.out.println("7. Exit");

            int choice = scan.nextInt();
            scan.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount: ");
                    float depositAmount = scan.nextFloat();
                    scan.nextLine();
                    customer.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter amount: ");
                    float withdrawAmount = scan.nextFloat();
                    scan.nextLine();
                    customer.withdrawal(withdrawAmount);
                    break;
                case 3:
                    customer.checkBalance();
                    break;
                case 4:
                    customer.editProfile();
                    break;
                case 5:
                    System.out.print("Enter new password: ");
                    String newPassword = scan.nextLine();
                    customer.changePassword(newPassword);
                    break;
                case 6:
                    System.out.print("Enter account type (current/savings): ");
                    String accountType = scan.nextLine();
                    System.out.print("Enter account ID: ");
                    String accountId = scan.nextLine();
                    System.out.print("Enter account description: ");
                    String accountDescription = scan.nextLine();
                    
                    if (accountType.equalsIgnoreCase("current")) {
                        Current current = new Current(accountId, accountDescription);
                        current.display();
                        }
                    else if (accountType.equalsIgnoreCase("savings")) {
                        Savings savings = new Savings(accountId, accountDescription);
                        savings.display();
                        }
                    else {
                    System.out.println("Invalid account type!");
                    }
                    break;
                    case 7:
                    System.out.println("Thank you for using our banking service.");
                    System.exit(0);
                    break;
                    default:
                    System.out.println("Invalid choice!");
                    break;
            }

            System.out.print("\nDo you want to continue? (yes/no): ");
            String continueChoice = scan.nextLine();

            if (continueChoice.equalsIgnoreCase("no")) {
                System.out.println("Thank you for using our banking service.");
                System.exit(0);
            }
        }
        }
        else {
            System.out.println("Invalid username or password!");
        }
    }
}

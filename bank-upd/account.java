package bank;
abstract class Account {
 String accountId;
 String description;
 float minimumBalance;



    public Account(String accountId, String description, float minimumBalance) {
        this.accountId = accountId;
        this.description = description;
        this.minimumBalance = minimumBalance;
    }

    public void display() {
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
        @Override
        public void display() {
            System.out.println("--- Current Account ---");
            System.out.println("Account ID: " + accountId);
            System.out.println("Description: " + description);
            System.out.println("Minimum Balance: " + minimumBalance);
        }
    }
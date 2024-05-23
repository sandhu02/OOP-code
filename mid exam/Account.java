public class Account {
    private String accountNumber;
    private String accountType;
    private double balance;

    public Account(String accountNumber, String accountType) {
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = 0.0;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public boolean withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            return true; 
        }
        return false; 
    }
    public double getBalance() {
        return balance;
    }
    public void viewAccountInfo(){
        System.out.println("Account Number : "+accountNumber);
        System.out.println("Account Type : "+accountType);
        System.out.println("Balance : "+balance);
        System.out.println();
    }
}

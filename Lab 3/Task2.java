class Account{
    private double balance;

    Account(){
        balance=0;
    }
    Account(double balance){
        this.balance=balance;
    }
    public void deposit(double amount){
        balance+=amount;
    }
    public void withdraw(double amount){
        balance-=amount;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public double getBalance() {
        return balance;
    }
}

public class Task2 {
    public static void main(String[] args) {
        Account account = new Account(23);

        Account account2=new Account(account.getBalance());
        account2.deposit(7);
        System.out.println(account2.getBalance());
    }
}

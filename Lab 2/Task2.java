class Account{
    double balance;

    Account(){
        balance=0;
    }
    Account(int bal){
        balance=bal;
    }
    public void withdraw(double bal){
        balance-=bal;
    }
    public void deposit(double amount){
        balance+=amount;
    }
}    
public class Task2 {
    public static void main(String[] args) {
        Account account = new Account();
        System.out.println(account.balance);
        
        Account account2 =new Account(78);
        System.out.println(account2.balance);

        account2.withdraw(8);
        System.out.println(account2.balance);

        account2.deposit(900);
        System.out.println(account2.balance);

    }
    
}

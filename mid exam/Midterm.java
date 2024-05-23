import java.util.ArrayList;
import java.util.List;

class Employee {    
    private String name;
    private String employeeId;
    private String role;

    public Employee(String name, String employeeId, String role) {
        this.name = name;
        this.employeeId = employeeId;
        this.role = role;
        
    }
    public String getRole() {
        return role;
    }

    public void addCustomerAccount(Customer customer,Account account){
        customer.addAccount(account);
    }
    public void viewAccounts(Customer customer){
        List<Account> accounts;
        accounts=customer.getAccounts();

        for (int i=0;i<accounts.size();i++){
            (accounts.get(i)).viewAccountInfo();
        }
    }
}

class Bank {
    private List<Employee> employees;
    private List<Customer> customers;

    public Bank() {
        this.employees = new ArrayList<>();
        this.customers = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public int getTotalEmployees() {
        return employees.size();
    }

    public int getTotalCustomers() {
        return customers.size();
    }

    public double getTotalBankBalance() {
        double totalBalance = 0.0;
        for (Customer customer : customers) {
            for (Account account : customer.getAccounts()) {
                totalBalance += account.getBalance();
            }
        }
        return totalBalance;
    }
}
class Account {
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
    }
}
class Customer{
    private String name;
    private String customerId;
    private List<Account> accounts;

    public Customer(String name, String customerId) {
        this.name = name;
        this.customerId = customerId;
        this.accounts = new ArrayList<>();
    }
    public void addAccount(Account account) {
        accounts.add(account);
    }
    public List<Account> getAccounts() {
        return accounts;
    }
}

public class Midterm{

    public static void main(String[] args) {
        Bank bank = new Bank();
    
        // Add employees to the bank
        Employee manager = new Employee("John Doe", "1001", "Manager");
        Employee clerk = new Employee("Jane Smith", "1002", "Clerk");
        bank.addEmployee(manager);
        bank.addEmployee(clerk);
    
        // Add customers to the bank
        Customer customer1 = new Customer("Alice", "2001");
        Customer customer2 = new Customer("Bob", "2002");
        bank.addCustomer(customer1);
        bank.addCustomer(customer2);
    
        // Create accounts for customers
        Account account1 = new Account("10001", "savings");
        Account account2 = new Account("10002", "current");
        customer1.addAccount(account1);
        customer2.addAccount(account2);
    
        // Perform transactions
        account1.deposit(1000);
        account2.deposit(2000);
        account1.withdraw(500);
    
        // Display bank statistics
        System.out.println("Total number of employees: " + bank.getTotalEmployees());
        System.out.println("Total number of customers: " + bank.getTotalCustomers());
        System.out.println("Total bank balance: $" + bank.getTotalBankBalance());
    }
}

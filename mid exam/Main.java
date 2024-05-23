public class Main {
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

        //add account by employee
        Account account3 = new Account("10003", "savings");
        account3.deposit(500);
        manager.addCustomerAccount(customer2, account3);

        // Perform transactions
        account1.deposit(1000);
        account2.deposit(2000);
        account1.withdraw(500);

        // Display bank statistics
        System.out.println("Total number of employees: " + bank.getTotalEmployees());
        System.out.println("Total number of customers: " + bank.getTotalCustomers());
        System.out.println("Total bank balance: $" + bank.getTotalBankBalance()+"\n");

        //view account by employee
        manager.viewAccounts(customer2);
    }
}

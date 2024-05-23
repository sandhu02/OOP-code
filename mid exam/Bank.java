import java.util.ArrayList;
import java.util.List;

public class Bank {
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

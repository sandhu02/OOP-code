import java.util.List;

public class Employee {
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


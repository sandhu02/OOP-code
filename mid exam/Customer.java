import java.util.ArrayList;
import java.util.List;

public class Customer{
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

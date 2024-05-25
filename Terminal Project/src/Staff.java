package src;
public class Staff extends Person{
    private String staffId;
    private String role;
    public Staff() {
        super();
        staffId = "";
        role = "";
    }
    public Staff(String name, String contactNumber, String email, String staffId, String role) {
        super(name, contactNumber, email);
        this.staffId = staffId;
        this.role = role;
    }
    public String getStaffId() {
        return staffId;
    }
    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }
    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }
    @Override
    public String toString() {
        return super.toString()+"staffId=" + staffId + ", role=" + role + "\n";
    }
        
}

public class Employee {
    private String employeeID;
    private String name;
    private final String designation = "Lab Attendant";

    Employee() {

    }
    Employee(String employeeID, String name) {
        this.employeeID = employeeID;
        this.name = name;
    }
    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }
    public String getEmployeeID() {
        return employeeID;
    }
}

package chapter9;

public class employee extends person {
    private int employeeId;
    private String empTitle;
    public employee(){
        super("robin");
        System.out.println("this is employee default constructor.");
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmpTitle() {
        return empTitle;
    }

    public void setEmpTitle(String empTitle) {
        this.empTitle = empTitle;
    }
}

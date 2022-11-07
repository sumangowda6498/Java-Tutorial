package chapter9_Inheritence;

public class Employee extends Person{
    private  int employeeID;
    private String title;
    public Employee(){// Constructor of subclass
       //super("suman");
        System.out.printf("\nThis is default constructor of employee");
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}

import java.time.LocalDate;
import java.util.Date;

public class Employee {
    private String name;
    private String employeeNumber;
    private LocalDate hireDate;

    public Employee(String name, String employeeNumber, LocalDate hireDate) throws InvalidEmployeeNumber {
        this.name = name;
        this.employeeNumber = employeeNumber;
        if(this.employeeNumber.equals("-1-c") || this.employeeNumber.equals("99999"))
        {
            throw new InvalidEmployeeNumber(employeeNumber);
        }
        this.hireDate = hireDate;
    }
    public Employee(Employee employee)
    {
        this.name = employee.getName();
        this.employeeNumber = employee.getEmployeeNumber();
        this.hireDate = employee.getHireDate();
    }
    public Employee()
    {}
    public String getName() {
        return name;
    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    @Override
    public String toString() {
        return  "Name: " + name +
                "\nEmployeeNumber: " + employeeNumber +
                "\nHire Date=" + hireDate;
    }
}

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class EmployeeDemo {
    public static void main(String[] args) throws InvalidEmployeeNumber, InvalidHourlyPayRate, InvalidShift {
        LocalDate day = LocalDate.of(2016,04,01);

        try {
            Employee employee = new Employee("Mohamed", "-1-c", day);
            System.out.println(employee);
            System.out.println("----------");
        }
        catch (InvalidEmployeeNumber e)
        {
            System.out.println(e.getMessage());
        }
        try {
            ProductionWorker pw = new ProductionWorker((new Employee("Hala","99-V",LocalDate.of(2014,03,15))),
                    (new ProductionWorker(1,-1)));
            System.out.println(pw);
            System.out.println("----------");
        }
        catch (InvalidHourlyPayRate e)
        {
            System.out.println(e.getMessage());
        }
        catch (InvalidShift e)
        {
            System.out.println(e.getMessage());
        }
        catch (InvalidEmployeeNumber e)
        {
            System.out.println(e.getMessage());
        }
        try {
            ProductionWorker pw2 = new ProductionWorker((new Employee("Eric","443-F",LocalDate.of(2014,05,20))),
                    (new ProductionWorker(4,11)));
            System.out.println(pw2);
            System.out.println("----------");
        }
        catch (InvalidHourlyPayRate e)
        {
            System.out.println(e.getMessage());
        }
        catch (InvalidShift e)
        {
            System.out.println(e.getMessage());
        }
        catch (InvalidEmployeeNumber e)
        {
            System.out.println(e.getMessage());
        }

    }
}

import java.util.Scanner;
import java.util.Arrays;

public class PayrollDemo {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        int [] employeeId = {  1302850,4520125,5658845, 7580489, 7895122, 8451277,8777541};
        Arrays.sort(employeeId);
        PayRoll pay = new PayRoll();
        pay.setEmployeeId(employeeId);
        int [] hours = new int[7];
        double [] payrate = new double[7];
        double [] wages = new double[7];
        int x;
        for (x = 0; x < employeeId.length;++x)
        {
            System.out.println("Enter the pay rate for the employee with ID: " + employeeId[x]);
            payrate[x] = key.nextDouble();
            System.out.println("Enter working hours for the employee with ID: " + employeeId[x]);
            hours[x] = key.nextInt();
            pay.setHours(hours);
            pay.setPayRate(payrate);
            wages[x] = pay.setGrossPay(x);
            pay.setWages(wages);
        }
        System.out.println("Employee ID\t\tGross Pay");
        for (int i = 0; i < employeeId.length; ++i) {
            System.out.println(employeeId[i] + "\t\t\t\t"+ wages[i]);
        }
        System.out.println("Enter the employee ID to find gross pay: ");
        int num = key.nextInt();
        pay.getIndex(num);
        System.out.printf("Gross pay for employee with ID "+ num + " is: $%.2f",pay.getGrossPay());


    }
}

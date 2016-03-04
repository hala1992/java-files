import java.util.Arrays;

public class PayRoll {

    private int [] employeeId;
    private int [] hours;
    private double [] payRate;
    private double [] wages;
    private int index;
    public void setEmployeeId(int[] employeeId) {
        this.employeeId = new int [employeeId.length];
        for (int x = 0; x < employeeId.length; ++x) {
            this.employeeId[x] = employeeId[x];
        }
    }

    public void setHours(int[] hours) {
        this.hours = new int [hours.length];
        for (int x = 0; x < hours.length; ++x) {
            this.hours[x] = hours[x];
        }
    }

    public void setPayRate(double[] payRate) {
        this.payRate = payRate;
        for (int x = 0; x < payRate.length; ++x) {
            this.payRate[x] = payRate[x];
        }
    }

    public void setWages(double[] wages)
    {
        this.wages = wages;
        for (int x = 0; x < wages.length; ++x) {
            this.wages[x] = wages[x];
        }
    }

    public int getEmployeeId() {
        return this.employeeId[index];
    }

    public int getHours(int x) {
        return hours[x];
    }

    public double getPayRate(int x) {
        return payRate[x];
    }

    public void getIndex(int id)
    {
        index =  Arrays.binarySearch(employeeId,id);
    }
    public double setGrossPay(int x)
    {
        return getHours(x) * getPayRate(x);
    }
    public double getGrossPay()
    {
        return wages[index];
    }
}

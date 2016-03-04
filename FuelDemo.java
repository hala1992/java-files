import java.util.Scanner;

public class FuelDemo {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.println("Enter car current mileage: ");
        double miles = key.nextDouble();
        System.out.println("Enter car current amount of fuel: ");
        double fuel = key.nextDouble();

        Odometer o1 = new Odometer();
        o1.setCurrentMileage(miles,fuel);
        FuelGauge f1 = new FuelGauge(fuel);

        while (f1.getFuel() < 15)
        {
            f1.fuelIncrementing();
            System.out.println("Fuel level: " + f1.getFuel());
        }
        System.out.println("Car gauge is full.");
        while (f1.getFuel() > 0)
        {
            o1.setFuelGauge(f1);
            System.out.println("Miles: " + o1.getCurrentMileage());
            System.out.println("Fuel level: " + f1.getFuel());
        }
        System.out.println("Car gauge is empty");
    }
}

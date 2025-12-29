import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter driver name: ");
        String dName = sc.nextLine();

        System.out.print("Enter license number: ");
        String license = sc.nextLine();

        Driver driver = new Driver(dName, license);

        System.out.println("\nEnter Car Info");
        System.out.print("Brand: ");
        String carBrand = sc.nextLine();

        System.out.print("Year: ");
        int carYear = sc.nextInt();

        System.out.print("Doors: ");
        int doors = sc.nextInt();
        sc.nextLine();

        System.out.print("Fuel type: ");
        String fuel = sc.nextLine();

        Car car = new Car(carBrand, carYear, doors, fuel);
        car.setDriver(driver);

        System.out.println("\nEnter Motorcycle Info");
        System.out.print("Brand: ");
        String bikeBrand = sc.nextLine();

        System.out.print("Year: ");
        int bikeYear = sc.nextInt();

        System.out.print("Has sidecar (write true/false): ");
        boolean sidecar = sc.nextBoolean();

        Motorcycle bike = new Motorcycle(bikeBrand, bikeYear, sidecar);
        bike.setDriver(driver);

        System.out.println("\nEnter Truck Info");
        System.out.print("Brand: ");
        sc.nextLine();
        String truckBrand = sc.nextLine();

        System.out.print("Year: ");
        int truckYear = sc.nextInt();

        System.out.print("Capacity (tons): ");
        double capacity = sc.nextDouble();

        System.out.print("Number of axles: ");
        int axles = sc.nextInt();

        Truck truck = new Truck(truckBrand, truckYear, capacity, axles);
        truck.setDriver(driver);

        Vehicle[] vehicles = {car, bike, truck};

        System.out.println("\nVEHICLE INFO");

        for (Vehicle v : vehicles) {
            v.startEngine();
            v.displayInfo();
            v.driver.displayDriverInfo();
            v.stopEngine();
            System.out.println("---------------------");
        }
        sc.close();
    }
}

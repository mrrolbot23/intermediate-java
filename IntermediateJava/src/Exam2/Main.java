package Exam2;


import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

abstract class Vehicle implements Comparable<Vehicle> {
    private String make;
    private String vin;
    private int price;

    public int compareTo(Vehicle vehicle) {
        if(price == vehicle.getPrice())
            return 0;
        else if (price> vehicle.getPrice())
            return 1;
        else
            return -1;
    }


    public Vehicle(String make, String vin, int price) {
        this.make = make;
        this.vin = vin;
        this.price = price;
    }

    public Vehicle() {
        this.make = "no-make";
        this.vin = "no-vin";
        this.price = 0;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return
                "make='" + make + '\'' +
                ", vin='" + vin + '\'' +
                ", price=" + price +
                '}';
    }
}

class Motorcycle extends Vehicle {
    private int topSpeed;

    public Motorcycle(String make, String vin, int price, int topSpeed) {
        super(make, vin, price);
        this.topSpeed = topSpeed;
    }

    public Motorcycle() {
        this.topSpeed = 0;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    @Override
    public String toString() {
        return "Motorcycle{" + super.toString() + ", topSpeed=" + topSpeed + "}";
    }
}

class Truck extends Vehicle {
    private int towingCapacity;

    public Truck(String make, String vin, int price, int towingCapacity) {
        super(make, vin, price);
        this.towingCapacity = towingCapacity;
    }

    public Truck() {
        this.towingCapacity = 0;
    }

    public int getTowingCapacity() {
        return towingCapacity;
    }

    public void setTowingCapacity(int towingCapacity) {
        this.towingCapacity = towingCapacity;
    }

    @Override
    public String toString() {
        return "Truck{" + super.toString() +
                ", towingCapacity=" + towingCapacity +
                '}';
    }
}

class Suv extends Vehicle {
    private int seats;

    public Suv(String make, String vin, int price, int seats) {
        super(make, vin, price);
        this.seats = seats;
    }

    public Suv() {
        this.seats = 0;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public String toString() {
        return "Suv{" + super.toString() +
                ", seats=" + seats +
                '}';
    }
}

class ElectricCar extends Vehicle {
    private int batteryRange;

    public ElectricCar(String make, String vin, int price, int batteryRange) {
        super(make, vin, price);
        this.batteryRange = batteryRange;
    }

    public ElectricCar() {
        this.batteryRange = 0;
    }

    public int getBatteryRange() {
        return batteryRange;
    }

    public void setBatteryRange(int batteryRange) {
        this.batteryRange = batteryRange;
    }

    @Override
    public String toString() {
        return "ElectricCar{" + super.toString() +
                ", batteryRange=" + batteryRange +
                '}';
    }
}

class GasCar extends Vehicle {
    private int horsepower;

    public GasCar(String make, String vin, int price, int horsepower) {
        super(make, vin, price);
        this.horsepower = horsepower;
    }

    public GasCar() {
        this.horsepower = 0;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    @Override
    public String toString() {
        return "GasCar{" + super.toString() +
                ", horsepower=" + horsepower +
                '}';
    }
}

class HybridCar extends Vehicle {
    private int mpg;

    public HybridCar(String make, String vin, int price, int mpg) {
        super(make, vin, price);
        this.mpg = mpg;
    }

    public HybridCar() {
        this.mpg = 0;
    }

    public int getMpg() {
        return mpg;
    }

    public void setMpg(int mpg) {
        this.mpg = mpg;
    }

    @Override
    public String toString() {
        return "HybridCar{" + super.toString() +
                ", mpg=" + mpg +
                '}';
    }
}




public class Main {

    public static void writeToFile(ArrayList<Vehicle> array) {
        try {
            FileWriter myWriter = new FileWriter("filename.txt");
            for(Vehicle x: array) {
                myWriter.write(x.toString() + "\n");
            }
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }


    public static void removeVehicleByVin(ArrayList<Vehicle> vehicleArray, String vin) {
        try {
            for (Vehicle x: vehicleArray) {
                if (x.getVin().equals(vin)) {
                    vehicleArray.remove(x);
                    System.out.println("Vehicle removed");
                }
            }
        } catch (Exception e) {
            System.out.println("Something Went Wrong");
        }
    }

    public static void addNewVehicle(ArrayList<Vehicle> vehicleArray, Vehicle vehicle) {
        vehicleArray.add(vehicle);
    }

    public static void displayVehicleByVin(ArrayList<Vehicle> vehicleArray, String vin) {
        try {
            for (Vehicle x: vehicleArray) {
                if (x.getVin().equals(vin)) {
                    System.out.println("Found: " + x);
                }
            }


        } catch (Exception e) {
            System.out.println("Something Went Wrong");
        }
    }

    public static void displayVehiclesLessThan(ArrayList<Vehicle> vehicleArray, double price) {
        System.out.println("Vehicles less than " + price);
        for (Vehicle x : vehicleArray) {
            if (x.getPrice() < price) {
                System.out.println(x);
            }
        }
    }

    public static void displayElectricCarsAbove(ArrayList<Vehicle> vehicleArray, int range) {
        System.out.println("Electric Vehicles above battery range of: ");
        for (Vehicle x: vehicleArray) {
            if (((ElectricCar) x).getBatteryRange() > range) {
                System.out.println(x);
            }
        }
    }




    public static void main(String[] args) {
        ArrayList<Vehicle> dealerVehicles = new ArrayList<>(50);
        Truck truck1 = new Truck("RAM", "12342456", 50000, 10000);
        Truck truck2 = new Truck("Chevy", "123444456", 70000, 10000);
        Truck truck3 = new Truck("Ford", "123456", 60000, 10000);
        ElectricCar electricCar = new ElectricCar();
        ElectricCar electricCar2 = new ElectricCar();
        ElectricCar electricCar3 = new ElectricCar();
        electricCar.setBatteryRange(300);
        electricCar2.setBatteryRange(400);
        electricCar3.setBatteryRange(500);
        addNewVehicle(dealerVehicles,truck1);
        addNewVehicle(dealerVehicles,truck2);
        addNewVehicle(dealerVehicles,truck3);


        Scanner scanner = new Scanner(System.in);
        int userInput = 0;

        try {
            do {
                System.out.println("1.Add New Vehicle to Inventory");
                System.out.println("2.Remove a vehicle based on it VIN number");
                System.out.println("3.Display the full details of any vehicle based on the VIN number");
                System.out.println("4.Display the vehicles based on lowest price first");
                System.out.println("5.Display vehicles with a price  lower than certain amount");
                System.out.println("6.Display electric cars based on certain range (above certain range)");
                System.out.println("7.Export the inventory into a text-based file");
                System.out.println("8.Exit");
                System.out.println("Select 1 - 8: ");
                userInput = scanner.nextInt();
                scanner.nextLine();
                if (userInput == 1) {
                    System.out.println("Enter make: ");
                    String make = scanner.nextLine();
                    System.out.println("Enter vin: ");
                    String vin = scanner.nextLine();
                    System.out.println("Enter price: ");
                    int price = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter Towing Capacity: ");
                    int towingCapacity = scanner.nextInt();
                    scanner.nextLine();
                    addNewVehicle(dealerVehicles, new Truck(make, vin, price, towingCapacity));
                } else if (userInput == 2) {
                    System.out.println("Enter the vin of the vehicle you want to remove: ");
                    String vin = scanner.nextLine();
                    removeVehicleByVin(dealerVehicles, vin);
                } else if (userInput == 3) {
                    System.out.println("Enter the vin of the vehicle you want to display: ");
                    String vin = scanner.nextLine();
                    displayVehicleByVin(dealerVehicles, vin);
                } else if (userInput == 4) {
                    Collections.sort(dealerVehicles);
                    System.out.println(dealerVehicles);
                } else if (userInput == 5) {
                    System.out.println("Enter amount to filter vehicles: ");
                    int amount = scanner.nextInt();
                    scanner.nextLine();
                    displayVehiclesLessThan(dealerVehicles, amount);
                } else if (userInput == 6) {
                    System.out.println("Enter range to filter electric vehicles: ");
                    int range = scanner.nextInt();
                    scanner.nextLine();
                    displayElectricCarsAbove(dealerVehicles, range);
                } else if (userInput == 7) {
                    System.out.println("Writing to file...");
                    writeToFile(dealerVehicles);
                }
            } while (userInput != 8);

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }





    }


}

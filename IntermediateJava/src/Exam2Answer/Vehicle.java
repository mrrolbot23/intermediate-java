package Exam2Answer;

public class Vehicle {
    protected String make;
    protected String vin;
    protected double price;

    public Vehicle(String make, String vin, double price) {
        this.make = make;
        this.vin = vin;
        this.price = price;
    }

    public Vehicle() {

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

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "make='" + make + '\'' +
                ", vin='" + vin + '\'' +
                ", price=" + price +
                '}';
    }
}

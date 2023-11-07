package Exam2Answer;

public class Motorcycle extends Vehicle{
    private int topSpeed;

    public Motorcycle(String make, String vin, double price, int topSpeed) {
        super(make, vin, price);
        this.topSpeed = topSpeed;
    }

    public Motorcycle() {
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "topSpeed=" + topSpeed +
                ", make='" + make + '\'' +
                ", vin='" + vin + '\'' +
                ", price=" + price +
                '}';
    }
}

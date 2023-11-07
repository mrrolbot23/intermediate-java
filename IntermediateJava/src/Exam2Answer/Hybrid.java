package Exam2Answer;

public class Hybrid extends Car{
    private int mpg;

    public Hybrid(String make, String vin, double price, int mpg) {
        super(make, vin, price);
        this.mpg = mpg;
    }

    public Hybrid() {
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
        return "Hybrid{" +
                "mpg=" + mpg +
                ", make='" + make + '\'' +
                ", vin='" + vin + '\'' +
                ", price=" + price +
                '}';
    }
}

package Inheritance;

class Vehicle {
    private String brand = "Ford";

    public String model = "F150";

    public void honk() {
        System.out.println("Tuu, tuu!");
    }

    protected void speed() {
        System.out.println("I go fast!!!");
    }

    public String getBrand() {
        return brand;
    }
}

class SUV extends Vehicle {
    private int x = 10;

    public void printModel() {
//        I can use model because is public  and is extended from Vehicle class
        System.out.println(model);
    }

    public String getBrand() {
        return "Ram";
    }

}

public class Main {

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle();
        v1.honk();

        SUV s1 = new SUV();
        s1.honk();

        s1.printModel();

        s1.speed();

        System.out.println(s1.getBrand());
    }

}

package Exam2Answer;

public class Main {

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("Ford", "1234", 10000);

        System.out.println(vehicle);

        Vehicle moto = new Motorcycle("honda", "3456", 5000,150);

        Vehicle hyb = new Hybrid();

        System.out.println(hyb);

        System.out.println(moto);
    }
}

package LinkedList;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        LinkedList<String> cars = new LinkedList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);

        cars.add(1, "Ram");

        System.out.println(cars);

        System.out.println(cars.contains("Volvo"));

    }

}

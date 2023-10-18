package Recursion.arrayLists;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
//        Array Lists hold objects

//        This is how you define the ArrayList
        ArrayList<String > cars = new ArrayList<String>();

//        This is how you add to an ArrayList
        cars.add("BMW");
        cars.add("Ford");
        cars.add("RAM");
        cars.add("Toyota");

        System.out.println(cars);

//        the get method takes an index number and returns its value
        System.out.println("Print the value of index 2");
        System.out.println(cars.get(2));

//        the set method allows you to change the index value
        System.out.println("Update the value of index 0 from 'BMW' to 'Mercedes'");
        cars.set(0, "Mercedes");
        System.out.println(cars);

//        the remove method allows you to delete
        System.out.println("Remove index 0");
        cars.remove(0);
        System.out.println(cars);

//        use the clear method to remove all elements
        System.out.println("Remove all elements using '.clear()'");
        cars.clear();
        System.out.println(cars);

//      I changed the order of the array
        cars.add("RAM");
        cars.add("BMW");
        cars.add("Toyota");
        cars.add("Ford");


//        to get the length of an arraylist use the .size() method
        System.out.println("The size of the arrays list is " + cars.size());

//        this a for loop example... use .size() and .get()
        System.out.println("This is an example of a for loop");
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }

//        this is an example of forEach loop
        System.out.println("This is an example of a forEach loop");
        for (String x: cars) {
            System.out.println(x);
        }

//        Collection.sort will sort your array in alphabetical order
        Collections.sort(cars);
        System.out.println(cars);

//        to use Integers and Doubles you have to use the wrapper class
        ArrayList<Integer> intArr = new ArrayList<Integer>();
        intArr.add(100);
        intArr.add(15);
        intArr.add(360);
        intArr.add(50);
        intArr.add(106);
        System.out.println("Original arrayList");
        System.out.println(intArr);

        System.out.println("Sorted with Collections.sort");
        Collections.sort(intArr);

        System.out.println(intArr);


    }
}

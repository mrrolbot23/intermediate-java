package GenericsAmr;

class Employee implements Comparable<Employee>{

    String id ;
    int age ;
    double salary ;

    public Employee(String id, int age, double salary) {
        this.id = id;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    public int compareTo(Employee v)
    {
        if (age > v.age)
            return 1;
        else
            return -1;
    }



}

public class Main {

    public static <T> void swap(int i, int j, T[] a)
    {
        T t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    public static <T extends Comparable<T> > void sort_generics(T[] a) {

        //As we are comparing the Non-primitive data types
        //we need to use Comparable class

        //Bubble Sort logic
        for (int i = 0; i < a.length - 1; i++) {

            for (int j = 0; j < a.length - i - 1; j++) {

                if (a[j].compareTo(a[j + 1]) > 0) {

                    swap(j, j + 1, a);
                }
            }
        }
    }

    public static < E > void printArray( E[] inputArray ) {
        // Display array elements
        for(E element : inputArray) {
            System.out.printf("%s ", element);
        }
        System.out.println();
    }
    public static void main(String args[]) {
        // Create arrays of Integer, Double and Character
        Integer[] intArray = { 1, 5, 3, 2, 10 };
        Double[] doubleArray = { 2.2, 1.1, 3.3, 4.4 };
        Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };

        Employee obj1 = new Employee("1", 10, 100);
        Employee obj2 = new Employee("2", 20, 200);
        Employee obj3 = new Employee("3", 30, 300);
        Employee[] empArray = {obj2,obj1,obj3};


        //sort_generics(doubleArray);
        sort_generics(empArray);
        printArray(empArray);

       // printArray(empArray);
        /*
        System.out.println("Array integerArray contains:");
        printArray(intArray);   // pass an Integer array

        System.out.println("\nArray doubleArray contains:");
        printArray(doubleArray);   // pass a Double array

        System.out.println("\nArray characterArray contains:");
        printArray(charArray);   // pass a Character array

         */
    }
}
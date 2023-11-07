package Generics;

//example of a class with one generic
class Test<T>{
    //an obj type T is declared
    T obj;

    Test(T obj){this.obj=obj;}

    public T getObject(){return this.obj;}
}

//example with two generics
class Testing<T, U>
{
    T obj1;  // An object of type T
    U obj2;  // An object of type U

    // constructor
    Testing(T obj1, U obj2)
    {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    // To print objects of T and U
    public void print()
    {
        System.out.println(obj1);
        System.out.println(obj2);
    }
}

//generic method
class Example {
    // A Generic method example
    static <T> void genericDisplay(T element)
    {
        System.out.println(element.getClass().getName()
                + " = " + element);
    }

}

public class Main {



    public static void main(String[] args) {

        Test<Integer> iObj= new Test<Integer>(15);
        Test<String> sObj= new Test<String>("string");

        //cannot use primitives must use class type (capital letter)
        //you tell it what type when you create it


        System.out.println(iObj.getObject());
        System.out.println(sObj.getObject());

        Testing <String, Integer> obj =
                new Testing<String, Integer>("GfG", 15);

        obj.print();

        // Calling generic method with Integer argument
        Example.genericDisplay(11);

        // Calling generic method with String argument
        Example.genericDisplay("GeeksForGeeks");

        // Calling generic method with double argument
        Example.genericDisplay(1.0);



    }
}

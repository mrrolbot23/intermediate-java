package AbstractClasses;


// Abstract class
abstract class Animal {
    protected int weight;
    // Abstract method (does not have a body)
    public abstract void animalSound();
    // Regular method
    public void sleep() {
        System.out.println("Zzz");
    }
}

class Pig extends Animal {
    public void animalSound() {
        System.out.println("oinc oinc");
    }
}

public class Main {

    public static void main(String[] args) {
        // cannot instantiate an object of abstract class
//        Animal animal = new Animal();

        Pig pig = new Pig();

        pig.animalSound();
    }
}

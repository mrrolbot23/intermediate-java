package Polymorphism;

class Parent {
    private int i = 10;

    public void func1() {
        System.out.println("Func1 from Parent");
    }
}

class Child1 extends Parent {
    private int j = 20;

    public void func2() {
        System.out.println("Func2 in Child1");
    }

    @Override
    public void func1() {
        System.out.println("Hellow");
    }
}

class Child2 extends Parent {
    private int x = 30;


    public void func2() {
        System.out.println("Func2 in CHild2");
    }
}

public class Main {

    public static void main(String[] args) {
        Parent obj1 = new Parent();
        obj1.func1();

        Child1 obj2 = new Child1();
        obj2.func1();

        Child2 obj3 = new Child2();
        obj3.func1();



    }


}

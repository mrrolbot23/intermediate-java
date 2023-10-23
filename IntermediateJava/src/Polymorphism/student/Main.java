package Polymorphism.student;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Student {
    private int x;

    public void func1() {
        System.out.println("in student");
    }
}

class PartTimeStudent extends Student{

    private int y;
    public void func1() {
        System.out.println("in part time student");
    }
}

class fullTimeStudent extends Student {
    private int z;

    public void func1() {
        System.out.println("in full time student");
    }
}
public class Main {
    public static void main(String[] args) {
        Student obj1 = new Student();
        obj1.func1(); // in student

        PartTimeStudent obj2 = new PartTimeStudent();
        obj2.func1(); // in part-time student

        fullTimeStudent obj3 = new fullTimeStudent();
        obj3.func1(); // in full time

        Student obj4 = new fullTimeStudent();
        obj4.func1(); // in full time student

        ArrayList<Student> arr = new ArrayList<Student>();

        arr.add(obj2);


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int x = scanner.nextInt();

        Student obj10;

        if (x == 0) {
            obj10 = new Student();
        } else if (x == 1) {
            obj10 = new PartTimeStudent();
        } else {
            obj10 = new fullTimeStudent();
        }


        arr.add(obj10);

        System.out.println(arr);
    }
}

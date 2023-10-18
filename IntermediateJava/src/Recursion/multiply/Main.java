package Recursion.multiply;

public class Main {
    public static int multiply(int a) {
        if (a > 1) {
            return a * multiply(a - 1);
        }
        else {
            return 1;
        }
    }

    public static void main(String[] args) {
        System.out.println(multiply(5));
    }
}

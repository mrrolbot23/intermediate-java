package Recursion;

public class Main {
    public static int sum(int a) {
        if (a > 0) {
            return a + sum(a - 1);
        } else {
            return 0;
        }
    }
    public static void main(String[] args) {
        System.out.println(sum(10));
    }
}

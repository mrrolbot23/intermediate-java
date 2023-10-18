package Recursion.factorial;

public class Main {

    public static int factorial(int a ) {
        if (a > 1) {
            return a * factorial( a- 1);
        }
        else {
            return 1;
        }
    }
}

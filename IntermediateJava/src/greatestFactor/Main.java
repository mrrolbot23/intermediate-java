package greatestFactor;

public class Main {

    public static int greatestFactor(int num1, int num2) {
        int minimum ;

        if (num1 > num2) {
            minimum = num2;
        } else {
            minimum = num1;
        }

        for (int i = minimum; i > 0; i--) {
            if (num1 % i == 0 && num2 % i == 0) {
                return i;
            }
        }

        return 1;

    }

    public static int greatestFactorRecursive(int num1, int num2) {
        if (num1 % num2 == 0) {
            return num2;
        }
        return greatestFactorRecursive(num2, num1%num2);
    }

    public static void main(String[] args) {
        System.out.println(greatestFactor(9, 17));

        System.out.println(greatestFactorRecursive(17, 9));
    }
}

package Recursion.decimalToBinary;

public class Main {
    public static String decimalToBinary(int number, String result) {
        if (number == 0) {
            return result;
        }

        result = number % 2 + result;
        return decimalToBinary(number/2, result);

    }

    public static void main(String[] args) {
        System.out.println(decimalToBinary(223, ""));
    }
}

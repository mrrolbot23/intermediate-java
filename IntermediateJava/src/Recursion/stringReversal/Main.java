package Recursion.stringReversal;

public class Main {

    public static String reverseString(String inputString) {
        if (inputString.isEmpty()) {
            return "";
        }

        return reverseString(inputString.substring(1)) + inputString.charAt(0);

    }

    public static void main(String[] args) {
        System.out.println(reverseString("This is a string."));

    }
}

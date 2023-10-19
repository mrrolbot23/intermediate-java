package Week1Execise;

public class Main {

    public static String stringReversal(String input) {
        if (input.isEmpty()) {
            return input;
        }
        return stringReversal(input.substring(1)) + input.charAt(0);
    }

    public static String stringReversal2(String input) {
        String reversed = "";

        for (int i = 0; i < input.length(); i++) {
            reversed = input.charAt(i) + reversed;
        }
        return reversed;
    }
    public static void main(String[] args) {
        String str = "This is a string";
        System.out.println(stringReversal(str));

        System.out.println(stringReversal2(str));
    }
}

package Recursion.palindrome;

public class Main {
    public static  boolean isPalindrome(String input) {
        if (input.isEmpty() || input.length() == 1) {
            return true;
        }

        if (input.charAt(0) == input.charAt(input.length()-1)) {
            return isPalindrome(input.substring(1, input.length() - 1));
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("raceca"));;
    }
}

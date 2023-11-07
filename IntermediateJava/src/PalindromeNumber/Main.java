package PalindromeNumber;

import java.sql.Struct;

public class Main {

    public static Boolean isPalindrome2 (String word ) {


        if (word.isEmpty() || word.length() == 1) {
            return true;
        }

        if (word.charAt(0) == word.charAt(word.length()-1)) {

            return isPalindrome2(word.substring(1, word.length() - 1));
        }
        return false;
    }

    public static boolean isPalindrome(String word) {
        String temp = "";

        for (int i = 0; i < word.length(); i++) {
            temp = word.charAt(i) + temp;
        }

        if (temp.equals(word)) {
            return true;
        } else {
            return false;
        }
    }



    public static void main(String[] args) {

        System.out.println(isPalindrome("i"));

        System.out.println(isPalindrome2("racecar"));

    }
}

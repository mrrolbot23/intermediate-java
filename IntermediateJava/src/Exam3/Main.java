package Exam3;

public class Main {
    public static void permutations(String userInput, String output) {
        if (userInput.isEmpty()) {
            System.out.println(output);
        } else {
            for (int i = 0; i < userInput.length(); i++) {
                String newInput = userInput.substring(0,i) + userInput.substring(i+1);
                System.out.println(newInput);
                permutations(newInput, userInput+newInput); // I don't know how to pass it back in
            }
        }
    }

    public static void main(String[] args) {

        String string1 = "H.E.B";
        String string2 = "CODE";

        string1 = string1 + string2;

        string2 = string1.substring(0, string1.length() - string2.length());

        string1 = string1.substring(string2.length());

        System.out.println(string1); // This variable is now CODE
        System.out.println(string2); // This variable is now H.E.B

        permutations("ERD", "");

    }
}

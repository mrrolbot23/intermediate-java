package ExceptionHandling;

import java.util.Scanner;

class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean valid = true;

        while (valid) {
            try {

                int x = scanner.nextInt();
                System.out.println(x);
                valid = false;

            } catch (Exception e) {
                System.out.println("Oh no! Something went wrong...");

            } finally {

                scanner.nextLine();

            }

        }

        try {
            throw new MyException("hello");
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }
}

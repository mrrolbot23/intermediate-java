package Recursion.Toh;

public class Main {
    public static void toh(int n, String from, String to, String using) {
        if (n == 0) {
            return;
        }
        toh(n-1, from, using, to);
        System.out.println("move " + n + " from " + from+ " to " + to);
        toh(n-1, using, to, from);

    }
    public static void main(String[] args) {
        toh(3, "a", "c", "b");
    }
}

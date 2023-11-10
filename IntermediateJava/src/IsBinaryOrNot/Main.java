package IsBinaryOrNot;

public class Main {
    public static boolean isBinary(Integer number) {

        if (number == 0) {
            return true;
        } else if (number%10 == 0 || number%10 == 1) {
            return isBinary(number / 10);
        } else {
            return false;
        }

    }
    public static void main(String[] args) {
        System.out.println(isBinary(1110701010));
    }
}

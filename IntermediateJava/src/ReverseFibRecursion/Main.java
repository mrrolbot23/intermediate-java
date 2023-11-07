package ReverseFibRecursion;

public class Main {
    // series in reverse order.
    public static void fibo(int n, int a, int b)
    {
        if (n > 0) {

            // Function call
            fibo(n - 1, b, a + b);

            // Print the result
            System.out.print(a + " ");
        }
    }
    public static void main(String[] args)
    {
        int N = 10;
        fibo(N, 0, 1);
    }
}

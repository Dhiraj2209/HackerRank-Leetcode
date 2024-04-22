public class Fib {
    public static void main(String[] args) {
        int n = 10;

        // Using iterative approach
        System.out.println("Iterative approach:");
        System.out.println("Fibonacci number at position " + n + ": " + fibonacciIterative(n));

        // Using recursive approach
        System.out.println("\nRecursive approach:");
        System.out.println("Fibonacci number at position " + n + ": " + fibonacciRecursive(n));
    }

    // Iterative approach
    public static int fibonacciIterative(int n) {
        if (n <= 1) {
            return n;
        }

        int fib1 = 0;
        int fib2 = 1;
        int fib = 0;

        for (int i = 2; i <= n; i++) {
            fib = fib1 + fib2;
            fib1 = fib2;
            fib2 = fib;
        }

        return fib;
    }

    // Recursive approach
    public static int fibonacciRecursive(int n) {
        if (n <= 1) {
            return n;
        }

        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }
}

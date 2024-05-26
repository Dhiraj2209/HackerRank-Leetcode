import java.util.Scanner;

public class PrimeFactorization {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to find its prime factors: ");
        int number = scanner.nextInt();
        
        System.out.print("Prime factors of " + number + " are: ");
        primeFactors(number);
    }

    public static void primeFactors(int n) {
        //2's Division
        while (n % 2 == 0) {
            System.out.print(2 + " ");
            n /= 2;
        }

        // n must be odd so skip 2
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            // While i divides n, print i and divide n
            while (n % i == 0) {
                System.out.print(i + " ");
                n /= i;
            }
        }

        //condition to check if n is a prime number greater than 2
        if (n > 2) {
            System.out.print(n);
        }
    }
}

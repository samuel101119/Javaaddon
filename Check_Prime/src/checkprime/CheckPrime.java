package checkprime;

import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long n = sc.nextLong();

        boolean isPrime = true;

        if (n <= 1) {
            isPrime = false;
        } else {
            for (long i = 2; i * i <= n; i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        System.out.println(isPrime);

        sc.close();
    }
}
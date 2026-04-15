package count;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        long n = sc.nextLong();

        int count = 0;

        while (n > 0) {
            n /= 10;
            count++;
        }

        System.out.println("Number of digits: " + count);

        sc.close();
    }
}
package reverseinteger;

import java.util.Scanner;

public class ReverseInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int n = sc.nextInt();

        long rev = 0;
        int num = Math.abs(n);

        while (num > 0) {
            rev = rev * 10 + (num % 10);
            num /= 10;
        }

        if (n < 0) {
            rev = -rev;
        }

        if (rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE) {
            System.out.println(0);
        } else {
            System.out.println("Reversed number: " + (int)rev);
        }

        sc.close();
    }
}
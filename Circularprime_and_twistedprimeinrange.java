import java.util.Scanner;

public class Circularprime_and_twistedprimeinrange {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter The Range for Printing The Twisted Circular Primenumbers:");
        int range = in.nextInt();
        int j;

        System.out.println("twisted Circular prime numbers");
        for (j = 1; j < range; j++) {
            if (circular(j) && twistedprimenum(j)) {
                System.out.println(j + " ");
            }

        }
    }

    static boolean circular(int n) {

        int counting = counter(n);

        if (!isprime(n)) {
            return false;
        }
        int rotate = n;
        for (int i = 0; i < counting; i++) {
            int temp = rotate;
            int divisor = 1;
            while (temp >= 10) {
                divisor *= 10;
                temp /= 10;
            }
            int firstnum = temp;//first digit;
            int remaining = rotate % divisor;//remaining digits;

            rotate = remaining * 10 + firstnum;//adding the firstnum to the remaining digits at the last;

            if (!isprime(rotate)) {
                return false;
            }
        }
        return true;

    }

    static int reverse(int n) {
        int rev = 0;
        int digit = 0;
        while (n != 0) {
            digit = n % 10;
            rev = rev * 10 + digit;
            n /= 10;
        }
        return rev;
    }

    static boolean twistedprimenum(int og) {
        int res = reverse(og);

        return isprime(og) && isprime(res);
    }

    static boolean isprime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    static int counter(int n) {
        int count = 0;
        while (n > 0) {
            n /= 10;
            count++;
        }
        return count;
    }
}

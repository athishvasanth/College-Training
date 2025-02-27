public class Circularprimenumber {

    static void prime(int n) {
        int counting = counter(n);
        int og = n;

        for (int i = 0; i < counting; i++) {
            int temp = n;
            int divi = 1;

            while (temp >= 10) {
                divi *= 10;
                temp /= 10;
            }
            int first = temp;
            int remain = n % divi;

            n = remain * 10 + first;

        }
            int j, primecount = 0;
            if (n <= 1) {
                System.out.println(og + "  is not prime");

            }

            for (j = 1; j <=n; j++) {
                if (n % j == 0) {
                    primecount++;
                }

            }
            if (primecount == 2) {
                System.out.println(og + "  is a circular prime");
            } else {
                System.out.println(og + "  is not a circular prime");
            }
        }


    static int counter ( int n) {
        int count = 0;
        while (n > 0) {
            n /= 10;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
      prime(2557);

    }
}

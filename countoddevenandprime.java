public class countoddevenandprime {
    public static void main(String[] args) {
        int n = 123456;


        int add = 0;
        int odd = 0;
        int count = 0;
        int prime = 0;
        while (n != 0) {
            int r = n % 10;


            if (r % 2 == 0) {
                add += r;
            } else {
                odd += r;
            }
            n = n / 10;

            if (isprime(r)){
                prime+=r;
            }
        }
        System.out.println("even:"+add);
        System.out.println("odd:"+odd);
        System.out.println("prime:"+prime);
    }

    static boolean isprime(int n) {
        int count = 0;
        while (n != 0) {
            int p = n % 10;
            n /= 10;

            for (int i = 1; i <= p; i++) {
                if (p % i == 0) {
                    count++;

                }

            }
            if (count == 2) {
                return true;

            } else {
                return false;

            }

        }


        return false;
    }
}



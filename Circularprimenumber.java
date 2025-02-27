import java.util.Scanner;

public class Circularprimenumber {

    static boolean prime(int n) {
        int counting = counter(n);
        int og = n;
        if (!isprime(og)) {
            return false;
        }
        int rotate=n;
        for (int i = 0; i < counting; i++) {
            int temp = rotate;
            int divi = 1;

            while (temp >= 10) {
                divi *= 10;
                temp /= 10;
            }
            int first = temp;
            int remain = rotate % divi;

            rotate = remain * 10 + first;
            if (!isprime(rotate)) {
                return false;

            }
        }
        return true;

    }
        static boolean isprime ( int n){
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


    static int counter ( int n) {
        int count = 0;
        while (n > 0) {
            n /= 10;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter The Number:");

      boolean prime=prime(in.nextInt());
      if (prime==false){
          System.out.println("not a circular prime");
      }
      else {
          if (prime==true){
              System.out.println("Circular prime");
          }
      }
    }
}

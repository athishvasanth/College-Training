public class pronic_abundant_niven {
    public static void main(String[] args) {
       int n=12;
        if (pronic(n) && abundant(n) && niven(n)) {
            System.out.println(n + " is a Pronic, Abundant, and Niven number");
        } else if (pronic(n) && abundant(n) && !niven(n)) {
            System.out.println(n + " is Pronic and Abundant");
        } else if (pronic(n) && !abundant(n) && niven(n)) {
            System.out.println(n + " is Pronic and Niven");
        } else if (!pronic(n) && abundant(n) && niven(n)) {
            System.out.println(n + " is Abundant and Niven");
        } else if (pronic(n) && !abundant(n) && !niven(n)) {
            System.out.println(n + " is only a Pronic number");
        } else if (!pronic(n) && abundant(n) && !niven(n)) {
            System.out.println(n + " is only an Abundant number");
        } else if (!pronic(n) && !abundant(n) && niven(n)) {
            System.out.println(n + " is only a Niven number");
        } else {
            System.out.println(n + " is NOT a Pronic, Abundant, or Niven number");
        }


    }
    static boolean pronic(int n){
        for (int i=1;i<n;i++) {
            if (i*(i+1)==n){
                return true;
            }
        }
              return false;

    }

        static boolean abundant(int n){
        int sum=0;
        for (int j=1;j<n;j++){
            if (n%j==0){
                sum+=j;

            }
            if (sum>n){
                return true;
            }
        }
        return false;

        }
        static boolean niven(int n){
        int og=n;

        int sum=0;
        while(n>0){
        int lastdigit=n%10;
        sum+=lastdigit;

        n/=10;
    }
            if (og%sum==0){
                return true;
            }
        return false;

}
        }




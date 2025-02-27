import java.util.Scanner;

public class Twisted_primenumber {

    static int reverse(int n){
        int rev=0;
        int digit=0;
        while(n!=0){
            digit=n%10;
            rev=rev*10+digit;
            n/=10;
        }
        return rev;
    }

    static boolean isprime(int n){
        int prime_count=0;
        if (n<=1){
            return false;
        }
        for (int i=1;i<=n;i++){
            if (n%i==0){
                prime_count++;
            }
        }
        if (prime_count==2){
           return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the n: ");
        int n=in.nextInt();
        int og=n;
        int res=reverse(n);

        boolean prime=isprime(og);
        if (prime==false){
            System.out.println(og+" is  not a Twisted Prime");
        }
        else {
            prime=isprime(res);
            if (prime==true){
                System.out.println(og +" is  a Twisted prime number");
            }
        }

    }
}

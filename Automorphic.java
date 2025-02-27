import java.util.Scanner;

public class Automorphic {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter n:");
        int n= in.nextInt();
        int sq=n*n;
        int rev=0;
        int res = counter(n);
        int ten=1;
       for (int i=0;i<res;i++){
          ten*=10;
       }
      if(n==sq%ten){
          System.out.println(n+"  is Automorphic number");
      }
      else{
          System.out.println(n+"  is not Auto morphic number");
      }

    }
    static int counter ( int n){
            int count = 0;
            while (n > 0) {
                n /= 10;
                count++;
            }
            return count;
        }

    }

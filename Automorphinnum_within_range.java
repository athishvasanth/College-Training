import java.util.Scanner;

public class Automorphinnum_within_range {
    public static void main(String[] args) {
            Scanner in=new Scanner(System.in);
            int range =in.nextInt();

                for (int j=1;j<=range;j++) {
                    int n=j;
                    int res = counter(n);
                    int ten=1;
                    for (int i=0;i<res;i++){
                        ten*=10;
                    }
                    int sq=j*j;
                    if (j== sq % ten) {
                        System.out.println(j);
                    }
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



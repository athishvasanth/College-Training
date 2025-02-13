import java.util.Scanner;

public class numpramid {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the n:");
        int n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = n - i; j >= 1; j--) {
                System.out.print("*");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(k);
            }
            for(int j=i-1;j>=1;j--) {
                System.out.print(j);
            }
                System.out.println();
            }
        }
    }


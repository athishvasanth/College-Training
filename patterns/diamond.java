import java.util.Scanner;

public class diamond {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the n:");
        int n = in.nextInt();
        int a,b;
        for (int i = 1; i <= n; i++) {
            for (int j =1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2*i-1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }

        for(a=n-1;a>0;a--){
            for (b=1;b<=n-a;b++){
                System.out.print(" ");
            }
            for (b=1;b<=2*a-1;b++){
                System.out.print("*");
            }
            System.out.println();

        }
    }
}


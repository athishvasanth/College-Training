import java.util.Scanner;

public class pattern5 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the n:");
        int n= in.nextInt();
        int i,j;
        for (i=0;i<n;i++){
            for (j=n-1;j<=i;j++){
                System.out.print(" ");
            }
            for (j=0;j<=n;j++){
                System.out.print("*");
            }
            for (j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

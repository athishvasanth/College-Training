import java.util.Scanner;

public class pattern4 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the n:");
        int n= in.nextInt();
int i,j;
        for (i=0;i<n;i++){

            for ( j=2*(n-i);j>=0;j--){
                System.out.print(" ");

            }

            for (j=0;j<=i;j++){
                System.out.print("1 ");
            }
            System.out.println();

        }
    }
}

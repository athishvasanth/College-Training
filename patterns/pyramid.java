import java.util.Scanner;

public class pyramid {
    public static void main(String[] args) {
      Scanner in=new Scanner(System.in);
        System.out.println("enter the n:");
        int n= in.nextInt();

        for (int i=1;i<=n;i++){
            for (int j=n-i;j>=1;j--){
                System.out.print(" ");
            }
            for (int k=1;k<=i;k++){
                System.out.print("*");
            }
            for (int z=2;z<=i;z++){
                System.out.println("*");
            }

            System.out.println();
        }
    }
}

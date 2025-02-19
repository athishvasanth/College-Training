import java.util.Arrays;
import java.util.Scanner;

public class numbertimesprinting {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the number:");
        int a=in.nextInt();
        System.out.println("enter the num to run num times:");
        int n=in.nextInt();

        for(int i=0;i<n;i++){
            for (int j=0;j<=i;j++){
                System.out.print(a);
            }
            System.out.print(" ");


        }
    }

}

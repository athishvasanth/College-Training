import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the n:");
        int n= in.nextInt();
        for (int i=0;i<n;i++){
            for (int j=0;j<=i;j++){
                System.out.print("1");
            }
            System.out.println();
        }
    }
}

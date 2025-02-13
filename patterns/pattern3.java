import java.util.Scanner;

public class pattern3 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the n:");
        int n= in.nextInt();
        int sum=0;
        for (int i=1;i<n;i++){
sum++;
            for (int j=1;j<=i;j++){
                System.out.print(sum);


            }
            System.out.println();
        }
    }
}

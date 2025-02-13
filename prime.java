import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();

        int i,count=0;

        for (i=2;i<=n;i++){
            count=0;
            for (int j=1;j<=i;j++){
                if (i%j==0){
                    count++;

                }

            }
            if(count==2){
                System.out.print(i + " ");
            }
        }
    }

}
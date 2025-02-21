import java.util.Scanner;

public class AccessinPrivate {

    private int a, b, c, Sum;


    private void print(int a, int b, int c, int Sum) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter A:");
        this.a = in.nextInt();
        System.out.println("enter B:");
        this.b = in.nextInt();
        System.out.println("enter C:");
        this.c = in.nextInt();
        this.Sum = this.a +this.b +this.c;
        System.out.println("The Sum:" + this.Sum);


    }

    public void get() {
        print(a,b,c,Sum);
    }
}

 class Add {
       public static void main(String[] args) {
      AccessinPrivate obj=new AccessinPrivate();
     obj.get();

        }
    }


import java.util.Scanner;

public class Accessinpublic {
    int a,b,c,Sum;

    public static void display(int a,int b,int c,int Sum){
        System.out.println("The  Sum is:"+Sum);
    }

    public static void main(String[] args) {
        Accessinpublic obj=new Accessinpublic();
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a:");
        obj.a=in.nextInt();
        System.out.println("Enter b:");
        obj.b=in.nextInt();
        System.out.println("Enter c:");
        obj.c=in.nextInt();
        obj.Sum= obj.a+obj.b+obj.c;
        display(obj.a,obj.b, obj.c, obj.Sum);
        in.close();
    }

}

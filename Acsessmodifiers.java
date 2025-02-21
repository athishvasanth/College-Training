import java.util.Scanner;

public class Acsessmodifiers {
    private String name;
    private int age;
   public Scanner in=new Scanner(System .in);


    public void getAge(int age,String name) {
        System.out.println("enter name:");
        this.name=in.nextLine();
        System.out.println("enter age:");
        this.age=in.nextInt();

    }

    public static void main(String[] args) {
        Acsessmodifiers obj=new Acsessmodifiers();
        obj.getAge(obj.age, obj.name);
        System.out.println("Name:"+obj.name);
        System.out.println("Age:"+obj.age);
    }
}

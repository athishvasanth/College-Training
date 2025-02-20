import java.util.Scanner;

public class Student {
    String name;
    int reg;

    public void print(String name, int reg){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter name:");
        this.name=in.next();
        System.out.println("Enter reg:");
        this.reg=in.nextInt();
    }

    public static void main(String[] args) {
        Student obj=new Student();
        obj.print(obj.name, obj.reg);
        for (int i=1;i<=5;i++){
            obj.print(obj.name,obj.reg);
            System.out.println("Student name:");
        }


    }
}



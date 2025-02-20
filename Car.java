import java.util.Scanner;

public class Car {

    String brand;

    void getbrand(String brand){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the Brand:");
        this.brand=in.next();
    }

    public static void main(String[] args) {
        Car obj=new Car();
        obj.brand="Unknown";
        System.out.println("Brand ="+obj.brand);
        obj.getbrand(obj.brand);
        System.out.println("The Brand is:"+obj.brand);
    }
}

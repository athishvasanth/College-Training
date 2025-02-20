public class Oops {
    int number;
    String str;

    public static void fun(int age,long phno){
        System.out.println("age is:"+age);
        System.out.println("phno is:"+phno);
    }


    public static void main(String[] args) {
        Oops var=new Oops();
        var.number=12;
        var.str="vasanth";

        var.fun(13,6379546752l);

        System.out.println(var.number);
        System.out.println(var.str);

    }
}

import java.util.Scanner;

public class Calculator_withmethodtypes {
    int a,b,Sum,dif,mul,div;

    public int Add(int a,int b,int Sum){
        this.Sum=this.a+this.b;
        System.out.println("The Sum of "+this.a+" and "+this.b+" is "+this.Sum);
        return this.Sum;
    }

    public int Sub(){
        this.dif=this.a-this.b;
        System.out.println("The difference of "+this.a+" and "+this.b+" is "+this.dif);
        return dif;
    }

    public void mul(int a,int b,int mul){
        this.mul=this.a*this.b;
        System.out.println("The mul of "+this.a+" and "+this.b+" is: "+this.mul);


    }
    public void div(){
        this.div=this.a/this.b;
        System.out.println("The div of "+this.a+" and "+this.b+" is: "+this.div);

    }

    public static void main(String[] args) {
        Calculator_withmethodtypes obj=new Calculator_withmethodtypes();
        Scanner in=new Scanner(System.in);
        System.out.println("Enter A:");
        obj.a= in.nextInt();
        System.out.println("Enter B:");
        obj.b= in.nextInt();
        obj.Add(obj.a, obj.b, obj.Sum);
        obj.Sub();
        obj.mul(obj.a, obj.b, obj.mul);
        obj.div();


    }
}

public class Area {
    public static void main(String[] args) {
        Area.Ar.Areaa(12.0);
        Area.Ar.Areaa(12);
        Area.Ar.Areaa(10,32);

    }
    class Ar {


        static double Areaa(double r) {

            double pi = 3.14;
            double Area = pi * (r * r);
            System.out.println("Area of circle:" + Area);
            return Area;
        }

        static int Areaa(int side) {
            side = 10;
            int square = side * side;
            System.out.println("Area of square:"+square);
            return square;
        }

        static void Areaa(int l, int b) {
            int rectangle = l * b;
            System.out.println("Area of rectangle:" + rectangle);

        }
    }




}

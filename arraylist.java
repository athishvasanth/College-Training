import java.util.ArrayList;
import java.util.Scanner;

public class arraylist {
    public static void main(String[] args) {
//        ArrayList<Integer> list=new ArrayList<>(10);
//
//        Scanner i = new Scanner(System.in);
//       for (int r=0;r<5;r++){
//           list.add(i.nextInt());
//       }
////       for (int r=0;r<5;r++){
////         System.out.println(list.get(r));
////     }
//        System.out.println(list);
        Scanner in =new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();

          for (int i=0;i<5;i++){
             list.add(new ArrayList<>());
             }
          for (int  i=0;i<5;i++){
              for (int j=0;j<3;j++){
                  list.get(i).add(in.nextInt());
              }

          }
        System.out.print(list);

    }
}

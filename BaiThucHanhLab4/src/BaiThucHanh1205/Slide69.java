package BaiThucHanh1205;

import java.util.Scanner;
import java.util.TreeSet;

public class Slide69 {
     public static void main(String[] args) {
          int number;
          TreeSet<Integer> tsi = new TreeSet<>();
          Scanner sc = new Scanner(System.in);
          tsi.add(0);
          tsi.add(1);
          tsi.add(4);
          tsi.add(2);
          tsi.add(7);
          tsi.add(9);
          System.out.println("Cac phan tu la");
          System.out.println(tsi);
          System.out.println("Nhap phan tu can them :");
          number= sc.nextInt();
          if(!tsi.contains(number)){
               tsi.add(number);
               System.out.println("Success");
               System.out.println("cac phan tu trong treeset la :");
               System.out.println(tsi);
          }else{
               System.out.println("Phan tu " + number + " da ton tai");
          }

     }
}

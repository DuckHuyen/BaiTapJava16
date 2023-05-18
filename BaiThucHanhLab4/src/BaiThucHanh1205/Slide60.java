package BaiThucHanh1205;

import java.util.LinkedHashSet;
import java.util.Set;

public class Slide60 {
     public static void main(String[] args) {
          Set<String> lhs = new LinkedHashSet<>(null);
          lhs.add("A");
          lhs.add("B");
          lhs.add("C");
          lhs.add("D");
          for (String string : lhs) {
               System.out.println(string);
          }
     }
}

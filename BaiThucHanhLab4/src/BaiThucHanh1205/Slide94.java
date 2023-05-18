package BaiThucHanh1205;

import java.util.LinkedHashMap;
import java.util.Map;

public class Slide94 {
     public static void main(String[] args) {
          LinkedHashMap<Integer, String> hm = new LinkedHashMap<Integer, String>();
          hm.put(100, "mo");
          hm.put(101, "dia");
          hm.put(103, "chat");
          for (Map.Entry<Integer, String> m : hm.entrySet()) {
               System.out.println(m.getKey() + " " + m.getValue());
          }
          System.out.println("Before :" + hm);
          hm.remove(101);
          System.out.println("After :" + hm);
     }
}

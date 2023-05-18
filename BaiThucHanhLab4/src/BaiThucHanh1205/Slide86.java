package BaiThucHanh1205;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Slide86 {
     public static void main(String[] args) {
          HashMap<String, String> hm = new HashMap<>();
          hm.put("kk", "kaka");
          hm.put("hh", "hihi");
          hm.put("aa", "lala");
          hm.put("oo", "momo");
          Set<Map.Entry<String, String>> shm = hm.entrySet();
          System.out.println("cac entry :");
          System.out.println(shm);
     }
}
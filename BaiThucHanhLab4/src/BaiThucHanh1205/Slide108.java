package BaiThucHanh1205;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Slide108 {
     public static void main(String[] args) {
          TreeMap<Integer, Double> treeMap = new TreeMap<>();
          treeMap.put(1, 9d);
          treeMap.put(2, 10.1d);
          treeMap.put(6, 9.5d);
          System.out.println("cac element :");
          Set<Map.Entry<Integer, Double>> stm = treeMap.entrySet();
          System.out.println(stm);
          treeMap.replace(2, 20.11d);
          treeMap.replace(6, 9.5d, 20.54d);
          System.out.println("cac element :");
          stm = treeMap.entrySet();
          System.out.println(stm);
     }
}
package BaiThucHanh1205;

import java.util.Set;
import java.util.TreeMap;

import javax.swing.RowFilter.Entry;

public class Slide106 {
     public static void main(String[] args) {
          TreeMap<Integer, Character> tm = new TreeMap<>();
          tm.put(6, 'A');
          tm.put(7, 'B');
          tm.put(8, 'C');
          tm.put(9, 'D');
          tm.put(10, 'E');
          Set<java.util.Map.Entry<Integer, Character>> stm = tm.entrySet();
          System.out.println("cac entry :");
          System.out.println(stm);
     }
}
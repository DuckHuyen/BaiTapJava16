package BaiThucHanh1205;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Slide88 {
     public static void main(String[] args) {
          HashMap<String, String> hmc = new HashMap<>();
          hmc.put("QNg", "Quảng Ngãi");
          hmc.put("ON", "Quảng Nam");
          hmc.put("ON", "Quảng Ninh");
          hmc.put("HCM", "Thành phố Hồ Chí Minh");
          System.out.println("Danh sách các thành phố trong hashMapCity: ");
          Set<Map.Entry<String, String>> setCity = hmc.entrySet();System.out.println(setCity);
          System.out.println("QNg: "+ hmc.get("QNg"));
          System.out.println("NT: " + hmc.get("NT"));
          if(hmc.containsValue("Thành phố Hồ Chí Minh"))
          {
               System.out.println("Có Thành phố Hồ Chí Minh trong hashMapCity");
          }
     }
}
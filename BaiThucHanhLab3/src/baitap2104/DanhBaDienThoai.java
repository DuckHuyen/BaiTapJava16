package baitap2104;

import java.util.HashMap;

public class DanhBaDienThoai implements DanhBa {
    private HashMap<String, String> danhBa = new HashMap<>();

    public void themMoi(String ten, String soDienThoai) {
        danhBa.put(ten, soDienThoai);
    }

    public void capNhat(String ten, String soDienThoai) {
        if (danhBa.containsKey(ten)) {
            danhBa.put(ten, soDienThoai);
        }
    }

    public void xoa(String ten) {
        if (danhBa.containsKey(ten)) {
            danhBa.remove(ten);
        }
    }

    public String timKiem(String ten) {
        if (danhBa.containsKey(ten)) {
            return danhBa.get(ten);
        }
        return null;
    }
   
}

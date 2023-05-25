package BaiThucHanh1905;

public class SinhVien {
	String ten;
	int diem;
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public int getDiem() {
		return diem;
	}
	public void setDiem(int diem) {
		this.diem = diem;
	}
	
	public SinhVien(String ten, int diem) {
		super();
		this.ten = ten;
		this.diem = diem;
	}
	@Override
	public String toString() {
		return "sinh vien " + ten +" "+ diem + " diem";
	}
	

}

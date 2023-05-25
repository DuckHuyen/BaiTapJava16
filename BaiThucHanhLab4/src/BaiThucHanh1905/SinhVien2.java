package BaiThucHanh1905;

public class SinhVien2 {
	int maSinhVien;
	String hoTen;
	String lop;
	public int getMaSinhVien() {
		return maSinhVien;
	}
	public void setMaSinhVien(int maSinhVien) {
		this.maSinhVien = maSinhVien;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public String getLop() {
		return lop;
	}
	public void setLop(String lop) {
		this.lop = lop;
	}
	public SinhVien2(int maSinhVien, String hoTen, String lop) {
		super();
		this.maSinhVien = maSinhVien;
		this.hoTen = hoTen;
		this.lop = lop;
	}
	public SinhVien2() {
		super();
	}
	@Override
	public String toString() {
		return "sinh vien " + hoTen + " ma sinh vien " + maSinhVien+ " lop " + lop ;
	}
	
	

}

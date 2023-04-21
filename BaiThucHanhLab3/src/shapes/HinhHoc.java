package shapes;

public abstract class HinhHoc {
	public final float Pi = 3.14f;
	public String ten;
	public float chuVi;
	public float dienTich;
	public float theTich;
	

	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public float getChuVi() {
		return chuVi;
	}
	public void setChuVi(float chuVi) {
		this.chuVi = chuVi;
	}
	public float getDienTich() {
		return dienTich;
	}
	public void setDienTich(float dienTich) {
		this.dienTich = dienTich;
	}
	public float getTheTich() {
		return theTich;
	}
	public void setTheTich(float theTich) {
		this.theTich = theTich;
	}
	public void inChuVi() {
		System.out.println("chu vi = "+chuVi);
	}
	public void inDienTich() {
		System.out.println("dien tich = "+dienTich);
	}
	public void inTheTich() {
		System.out.println("the tich = "+theTich);
	}
	public void inTen() {
		System.out.println("======"+ten+"======");
	}
	public abstract void inThongTin();
}

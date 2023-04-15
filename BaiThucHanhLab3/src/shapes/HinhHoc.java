package shapes;

public abstract class HinhHoc {
	public final float Pi = 3.14f;
	public String ten;
	public float chuVi;
	public float dienTich;
	public float theTich;

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

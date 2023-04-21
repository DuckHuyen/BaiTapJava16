package shapes;

import java.util.Scanner;

public class HinhVuong extends HinhHoc{
	public float canh;
	
	public float getCanh() {
		return canh;
	}
	public void setCanh(float canh) {
		this.canh = canh;
	}
	public HinhVuong() {
		ten = "hinh vuong";
		nhapCanh();
		tinhChuVi();
		tinhDienTich();
		
	}
	public void nhapCanh(){
		Scanner scan = new Scanner(System.in);
		System.out.println("nhap canh");
		canh = scan.nextFloat();
		
	}
	public void tinhChuVi() {
		chuVi = canh*4;
	}
	public void tinhDienTich() {
		dienTich = canh * canh;
	}
	@Override
	public void inThongTin() {
		inTen();
		System.out.printf("hinh vuong canh %.2f co chu vi la %.2f va dien tich la %.2f",canh,chuVi,dienTich);
	}

}

package shapes;

import java.util.Scanner;

public class HinhTron extends HinhHoc {
	public float banKinh;
	
	public HinhTron() {
		ten = "hinh tron";
		nhapBanKinh();
		tinhChuVi();
		tinhDienTich();
	}
	public void nhapBanKinh() {
		System.out.println("nhap ban kinh");
		Scanner scan = new Scanner(System.in);
		banKinh = scan.nextFloat();
	}
	public void tinhChuVi() {
		chuVi =  2*Pi *banKinh;
	}
	public void tinhDienTich() {
		dienTich = Pi *banKinh*banKinh;
	}
	@Override
	public void inThongTin() {
		inTen();
		System.out.printf("hinh tron ban kinh %.2f co chu vi la %.2f va dien tich la %.2f",banKinh,chuVi,dienTich);
	}
	
}

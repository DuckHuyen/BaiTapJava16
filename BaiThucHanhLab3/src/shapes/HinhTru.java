package shapes;

import java.util.Scanner;

public class HinhTru extends HinhTron {
	public float chieuCao;
	
	public HinhTru() {
		ten = "hinh tru";
		nhapChieuCao();
		tinhTheTich();
		tinhDienTich();	
	}
	public void nhapChieuCao() {
		Scanner scan = new Scanner(System.in);
		System.out.println("nhap chieu cao");
		this.chieuCao = scan.nextFloat();
	}
	public void tinhTheTich() {
		super.tinhDienTich();
		theTich = super.dienTich *chieuCao;
	}
	@Override
	public void tinhDienTich() {
		this.dienTich = chuVi*chieuCao+super.dienTich*2;
	}
	@Override
	public void inThongTin() {
		inTen();
		System.out.printf("hinh tru co ban kinh la %.2f chieu cao la %.2f co dien tich la %.2f va the tich la %.2f",banKinh,chieuCao,dienTich,theTich);
		
	}

}

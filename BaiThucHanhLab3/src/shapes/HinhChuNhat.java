package shapes;

import java.util.Scanner;

public class HinhChuNhat extends HinhHoc {
	public float chieuDai;
	public float chieuRong;
	
	public float getChieuDai() {
		return chieuDai;
	}
	public void setChieuDai(float chieuDai) {
		this.chieuDai = chieuDai;
	}
	public float getChieuRong() {
		return chieuRong;
	}
	public void setChieuRong(float chieuRong) {
		this.chieuRong = chieuRong;
	}
	public HinhChuNhat() {
		ten = "hinh chu nhat";
		nhapThongTin();
		tinhChuVi();
		tinhDienTich();
		
	}
	public void nhapThongTin() {
		Scanner scan = new Scanner(System.in);
		System.out.println("chieu dai la");
		this.chieuDai  = scan.nextFloat();
		System.out.println("chieu rong la");
		this.chieuRong = scan.nextFloat();
	}
	public void tinhChuVi() {
		chuVi = (chieuDai+chieuRong)*2;
	}
	public void tinhDienTich() {
		dienTich = chieuDai*chieuRong;
	}
	@Override
	public void inThongTin() {
		inTen();
		System.out.printf("hinh chu nhat chieu dai %.2f chieu rong %.2f co chu vi la %.2f va dien tich la %.2f",chieuDai,chieuRong,chuVi,dienTich);
	}
	

}

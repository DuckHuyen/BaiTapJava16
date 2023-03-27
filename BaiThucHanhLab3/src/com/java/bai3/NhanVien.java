package com.java.bai3;

import java.util.Scanner;

public class NhanVien {
	
		public String hoTen;
		public int tuoi;
		public float heSoLuong;
		public float luong;
		final float luongCoBan = 1490000f;
		public void nhapThongTinNhanVien()
		{
			Scanner scan = new Scanner(System.in);
			System.out.println("nhap ten nhan vien");
			hoTen =  scan.nextLine();
			System.out.println("nhap tuoi nhan vien");
			tuoi = scan.nextInt();
			System.out.println("nhap he so luong nhan vien");
			heSoLuong = scan.nextFloat();
		}
		public void tinhLuong()
		{
			 luong = luongCoBan*heSoLuong;
		}
		public void inThongTinNhanVien()
		{
			System.out.printf("nhan vien %s, %d tuoi co muc luong la %.2f",hoTen,tuoi,luong);
		}

	

}

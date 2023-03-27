package com.java.bai1;

import java.util.Scanner;

public class HinhTron {
	public float chuVi;
	public float dienTich;
	public float banKinh;
	final float pi = 3.14f;
	public void nhapBanKinh()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Ban kinh cua hinh tron la :");
		banKinh = scan.nextFloat();
	}
	public void tinhChuVi()
	{
	 chuVi = 2*pi*banKinh;
	}
	public void tinhDienTich()
	{
		dienTich = pi*banKinh*banKinh;
	}
	public void thongTinHinhTron()
	{
		System.out.printf("hinh tron co ban kinh la %.2f co chu vi la %.2f va dien tich la %.2f ",banKinh, chuVi,dienTich);
	}

}

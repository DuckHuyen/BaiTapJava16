package com.java.bai2;

import java.util.Scanner;

public class HinhTruTron {
	public float dienTichToanPhan;
	public float dienTichDay;
	public float banKinh;
	public float chieuCao;
	public float theTich;
	final float pi = 3.14f;
	public void nhapBanKinh()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Ban kinh cua hinh tru tron la :");
		banKinh = scan.nextFloat();
	}
	public void nhapChieuCao()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Chieu cao cua hinh tru tron la :");
		chieuCao = scan.nextFloat();
	}
	public void tinhDienTichToanPhan()
	{
	 dienTichToanPhan = 2*pi*banKinh*(banKinh+chieuCao);
	}
	public void tinhDienTichDay()
	{
		dienTichDay = 2*pi*banKinh*banKinh;
	}
	public void tinhTheTich()
	{
		theTich = 2*pi*banKinh*banKinh*chieuCao;
	}
	public void thongTinHinhTruTron()
	{
		System.out.printf("hinh tru tron co ban kinh la %.2f va chieu cao la %.2f co dien tich day la %.2f , dien tich toan phan la %.2f, và the tich la %.2f ",banKinh,chieuCao, dienTichDay,dienTichToanPhan,theTich);
	}
}

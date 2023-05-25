package BaiThucHanh1905;

import java.util.LinkedList;
import java.util.Scanner;

public class Slide112 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		LinkedList<SinhVien> sv = new LinkedList<>();
		int i= 0;
		int dem =0;
		while(i==0) {
			
			System.out.println("nhap ten sinh vien");
			String ten = scan.nextLine();
			if(ten=="") {
				i++;continue;
			}
			System.out.println("nhap diem sinh vien");
			int diem = scan.nextInt();
			scan.nextLine();
			SinhVien s = new SinhVien(ten, diem);
			sv.add(s);
			dem++;
		}
		int thilai=0;
		for(SinhVien s : sv) {
			if(s.diem<=5) {
				thilai++;
			}
		}
		System.out.println("co tat ca "+thilai+" sinh vien phai thi lai , danh sach nhu sau");
		for(SinhVien s : sv) {
			if(s.diem<=5) {
				System.out.println(s);
			}
		}
		int max = sv.get(0).diem;
		for(SinhVien s : sv) {
			if(s.diem>max) {
				max=s.diem;
			}
		}
		System.out.println("danh sach sinh vien co diem cao nhat la");
		for(SinhVien s : sv) {
			if(s.diem==max) {
				System.out.println(s);
			}
		}
		System.out.println("nhap ten sinh vien can tim kiem");
		String tim = scan.nextLine();
		boolean check = false;
		for(SinhVien s : sv) {
			if(s.ten.equals(tim)) {
				System.out.println(s);
				check=true;
			}
		}
		if(check==false)System.out.println("sinh vien tim kiem khong ton tai");
		
	}

}

package BaiThucHanh1905;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Slide114 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Map<Integer, SinhVien2> map = new HashMap<>();
		System.out.println("nhap so luong sinh vien muon nhap");
		int n = scan.nextInt();
		for(int i = 0; i <n;i++) {
			System.out.println("nhap ma sinh vien");
			int msv = scan.nextInt();
			scan.nextLine();
			System.out.println("nhap ho ten sinh vien");
			String ten = scan.nextLine();
			System.out.println("nhap lop cua sinh vien");
			String lop = scan.nextLine();
			SinhVien2 sv = new SinhVien2(msv, ten, lop);
			map.put(msv, sv);
		}
		System.out.println("nhap lop muon tim kiem");
		
		String tim = scan.nextLine();
		System.out.println("danh sach sinh vien cua lop "+tim+" la");
		for(SinhVien2 sv : map.values()) {
			if(sv.getLop().equals(tim)) {
				System.out.println(sv);
			}
			
		}
		System.out.println("nhap ma sinh vien muon tim kiem");
		int ma = scan.nextInt();
		for(SinhVien2 sv : map.values()) {
			if(sv.getMaSinhVien()==ma) {
				System.out.println(sv);
			}
			
		}
	}

}

package shapes;

import java.util.Scanner;

import com.java.bai1.HinhTron;

public class main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("1.Hinh Tron");
		System.out.println("2. Hinh Tru");
		System.out.println("3. Hinh Chu Nhat");
		System.out.println("4. Hinh Vuong");
		int n = scan.nextInt();
		switch(n) {
		case 1:{
		shapes.HinhHoc ht = new shapes.HinhTron();
		ht.inThongTin();
		}
		break;
		case 2:{
		shapes.HinhTru ht = new HinhTru();
		ht.inThongTin();
		}
		break;
		case 3:{
			shapes.HinhHoc hcn = new HinhChuNhat();
			hcn.inThongTin();
		}
		break;
		case 4 :{
			shapes.HinhHoc hv = new HinhVuong();
			hv.inThongTin();
		}
		}
		
	}

}

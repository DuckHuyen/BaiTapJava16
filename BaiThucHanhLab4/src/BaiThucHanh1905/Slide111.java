package BaiThucHanh1905;

import java.util.LinkedList;
import java.util.Scanner;

public class Slide111 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		LinkedList<Integer> list = new LinkedList<>();
		System.out.println("nhap so luong so nguyen duong muon nhap");
		int n = scan.nextInt();
		for(int i = 0 ; i<n;i++) {
			System.out.println("nhap so nguyen duong thu "+(i+1));
			int nhap = scan.nextInt();
			if(nhap>0) {
				list.add(nhap);
			}
			else {
				System.out.println("vui long chi nhap so nguyen duong , moi nhap lai");
			}
			
		}
		System.out.println("xuat mang");
		for(int o : list) {
			System.out.print(o+"\t");
		}
		
		int tong = 0 ;
		int dem=0;
		for(int o:list) {
			
			if(o%2==0) {
				tong = tong +o;
				dem ++;
			}
		}
		System.out.println("\ntrung binh cong cua cac so chan trong mang la "+(tong/dem));
	}

}

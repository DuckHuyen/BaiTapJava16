package BaiThucHanh1905;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Slide110 {
	public static void main(String[] args) {
		ArrayList<Integer> o = new ArrayList<>();
		System.out.println("chon so luong so nguyen muon nhap");
		int n = new Scanner(System.in).nextInt();
		for(int i = 0 ; i<n;i++) {
			System.out.println("nhap so thu "+(i+1));
			o.add(new Scanner(System.in).nextInt());
		}
		int max=o.get(0);
		for(int k :o) {
			if(k>max) max=k;
		}
		System.out.println("so nguyen co gia tri lon nhat la "+max);
		System.out.println("hien thi array list truoc khi xoa");
		for(int  a:o) {
			System.out.print(a+"\t");
		}
		System.out.println("\nnhap vao so nguyen muon xoa");
		int xoa = new Scanner(System.in).nextInt();
		for(int i=0;i<o.size() ;i++) {
			if(o.get(i)==xoa) {
				o.remove(i);
				i--;
			}
		}
		System.out.println("hien thi array list sau khi xoa");
		for(int  a:o) {
			System.out.print(a+"\t");
		}
		Collections.sort(o);
		System.out.println("danh sach khi duoc sap xep la");
		for(int  a:o) {
			System.out.print(a+"\t");
		}
	}

}

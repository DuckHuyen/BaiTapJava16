package BaiThucHanh1905;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class Slide113 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		HashSet<String> fruit = new HashSet<>();
		System.out.println("nhap ten cac loai trai cay cho danh sach , khong nhap gi de dung");
		while(true) {
			String nhap = scan.nextLine();
			if(nhap=="")break;
			else {
				fruit.add(nhap);
			}
		}
		System.out.println("so luong cac loai trai cay co trong danh sach la "+fruit.size());
		System.out.println("nhap ten 1 loai trai cay");
		String f = scan.nextLine();
		boolean check = false;
		for(String fr : fruit) {
			if(fr.equals(f)) {check=true;System.out.println("loai trai cay ban vua nhap co ton tai");};
		}
		if(check ==false) {
			System.out.println("khong tim thay phan tu");
			int xoa = new Random().nextInt(fruit.size());
			 Iterator<String> iterator = fruit.iterator();
		        for (int i = 0; i <= xoa; i++) {
		            iterator.next();
		        }
		        iterator.remove();

		        // In ra các phần tử còn lại trong HashSet
		        for (String tenHoaQua : fruit) {
		            System.out.println(tenHoaQua);
		        }
		}
		HashSet<String> fruit2 = new HashSet<>();
		System.out.println("nhap ten cac loai trai cay cho danh sach , khong nhap gi de dung");
		while(true) {
			String nhap = scan.nextLine();
			if(nhap=="")break;
			else {
				fruit2.add(nhap);
			}
		}
		for(String fr : fruit2) {
			fruit.add(fr);
		}
		System.out.println("cac loai trai cay trong danh sach ban dau la");
		Iterator<String> iterator = fruit.iterator();
		while(iterator.hasNext()) System.out.println(iterator.next());
		System.out.println("sau khi xoa la");
		for(String fr : fruit2) {
			for(String fra :fruit) {
				if(fra.equals(fr))fruit.remove(fra);
			}
		}
	 iterator = fruit.iterator();
		while(iterator.hasNext()) System.out.println(iterator.next());
		
		
	}

}

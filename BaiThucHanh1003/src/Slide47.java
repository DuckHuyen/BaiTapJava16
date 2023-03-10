import java.util.Scanner;

public class Slide47 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;
		do{System.out.println("vui long nhap so phan tu cua mang");
		n = scan.nextInt();}while(n<1);
		int mang[] = new int[n];
		System.out.println("vui long nhap gia tri cac phan tu cua mang");
		for(int i = 0 ; i< mang.length ;i++) {
			System.out.printf("mang[%d] = ",i);
			mang[i] =  scan.nextInt();
		}
		int tong = 0;
		System.out.print("tong cac so chan cua mang la = ");
		for(int  i = 0 ; i<mang.length ; i++) {
			if(mang[i]%2==0) {
				tong = tong +mang[i];
			}
		}
		System.out.println(tong);
	}

}

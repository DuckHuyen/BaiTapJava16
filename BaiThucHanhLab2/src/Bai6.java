import java.util.Scanner;

public class Bai6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("nhap vao 1 so");
		int n = scan.nextInt();
		int tong = 1 ;
		for(int i = 1;i<=n;i++) {
			tong = tong *i;
		}
		System.out.println("giai thua cua "+n+" la "+tong);
	}

}

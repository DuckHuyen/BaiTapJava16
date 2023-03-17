import java.util.Scanner;

public class Bai1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("nhap vao so a");
		int a = scan.nextInt();
		System.out.println("nhap vao so b");
		int b = scan.nextInt();
		System.out.println("tong cua 2 so la "+(a+b));
		System.out.println("hieu cua 2 so la "+(a-b));
		System.out.println("tich cua 2 so la "+(a*b));
		System.out.println("thuong cua 2 so la "+(a/b)+" va du cua phep chia la "+(a%b));
		if(a>b) {
			System.out.println("a > b");
		}
		else {
			if(a==b) {
				System.out.println("a = b");
			}
			else {
				System.out.println("a < b");
			}
		}
		
	}
}

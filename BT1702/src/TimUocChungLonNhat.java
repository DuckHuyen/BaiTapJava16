import java.util.Scanner;

// bài demo tìm ước chung lớn nhất . Trần Đức Huyên mã sinh viên 2121050832
public class TimUocChungLonNhat {
	public static int UCLN(int a , int b) {
		int c =(a>b)?b:a;
		while(a%c!=0||b%c!=0) {
			c--;
		}
		return c;
	}
	//hàm main để khởi chạy 
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("nhap a" );
		int a = scan.nextInt();
		System.out.println("nhap b");
		int b = scan.nextInt();
		System.out.println("uoc chung lon nhat cua 2 so la "+UCLN(a, b));
	}

}

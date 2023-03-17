import java.util.Scanner;

public class Bai3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("ten cua ban la gi");
		String ten = scan.nextLine();
		System.out.println("ban sinh nam bao nhieu");
		int nam = scan.nextInt();
		int n = 2003-nam;
		if(n<16) {
			System.out.println("Ban "+ten+" o do tuoi vi thanh nien");
		}
		else {
			if(n>=18) {
			System.out.println("Ban "+ten+" da gia");
			}
			else {
			System.out.println("Ban "+ten+" o do tuoi truong thanh");
			}
		}
	}

}

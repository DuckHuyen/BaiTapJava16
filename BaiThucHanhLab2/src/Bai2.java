import java.util.Scanner;

public class Bai2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("nhap vao 1 so");
		int n = scan.nextInt();
		if(n==0) {
			System.out.println("n la so 0");
		}
		else {
			if(n%2==0) {
				System.out.println("n la so chan");
			}
			else {
				System.out.println("n la so le");
			}
		}
	}

}

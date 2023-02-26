import java.util.Scanner;

public class Slide35 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("vui long nhap a");
		int a = scan.nextInt();
		System.out.println("vui long nhap b");
		int b = scan.nextInt();
		int min = a>b?b:a;
		System.out.println("so nho nhat trong 2 so la"+min);
	}

}

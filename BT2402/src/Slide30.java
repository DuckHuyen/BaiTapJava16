import java.util.Scanner;

public class Slide30 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("vui long nhap so n");
		int n = scan.nextInt();
		int a = 0;
		while(n>0) {
			int b = n%10;
			n = n/10;
			a += b;
		}
		System.out.println(a);
	}

}

import java.util.Scanner;

public class Slide40 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("vui long nhap vao so ngay");
		int ngay = scan.nextInt();
		switch(ngay) {
		case 1: System.out.println("chu nhat");
		case 2: System.out.println("thu hai");
		case 3: System.out.println("thu ba");
		case 4: System.out.println("thu tu");
		case 5: System.out.println("thu nam");
		case 6: System.out.println("thu sau");
		case 7: System.out.println("thu bay");
		default: System.out.println("ngay nhap vao khong hop le");
		}
	}

}

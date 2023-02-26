import java.util.Scanner;

public class Slide34 {

	public static void main(String[] args) {
		System.out.println("dang phuong trinh bac 2  , vui long nhap lan luot a b c");
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble() , b = sc.nextDouble() , c = sc.nextDouble();
		double delta = b*b - 4*a*c;
		if(delta<0) {
			System.out.println("phuong trinh vo nghiem");
		}
		else if(delta == 0) {
			System.out.println("phuong trinh co nghiem kep la "+(-b/2*a));	
		}
		else {
			System.out.println("phuong trinh co 2 nghiem phan biet");
			System.out.println("x1 = "+(-b + Math.sqrt(delta) / 2*a));
			System.out.println("x2 = "+(-b - Math.sqrt(delta) / 2*a));
		}
		
	}

}

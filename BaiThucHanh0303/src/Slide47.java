import java.util.Scanner;

public class Slide47 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int tong = 0 ;
		int n;
		String s ="";
		
		do
		{
			System.out.println("vui long nhap so nguyen");
			 n = scan.nextInt();
			 s = s + n +" ";
			tong +=n;
		}
		while(tong<=100);
		String d = s.trim().replace(" ", " + ")+" = "+tong;
		System.out.println("tong cua cac so nguyen : "+d);
		
		
	}

}

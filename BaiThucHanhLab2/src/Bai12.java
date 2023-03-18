import java.util.Scanner;

public class Bai12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("nhap so cot cua ma tran");
		int soCot = scan.nextInt();
		System.out.println("nhap so hang cua ma tran");
		int soHang = scan.nextInt();
		int arr[][] = new int [soHang][soCot];
		System.out.println("nhap phan tu");
		for(int i = 0 ;i<soHang ; i++) {
			for(int j = 0 ; j<soCot ; j++) {
				System.out.printf("arr[%d][%d] = ",i,j);
				arr[i][j] = scan.nextInt();
			}
		}
		int max = arr[0][0];
		for(int i = 0 ;i<soHang ; i++) {
			for(int j = 0 ; j<soCot ; j++) {
				if(max<arr[i][j]) {
					max = arr[i][j];
				}
			}
		}
		System.out.println("phan tu co gia tri lon nhat trong ma tran la "+ max);
		
	}

}

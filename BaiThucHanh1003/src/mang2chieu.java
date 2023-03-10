import java.util.Scanner;

public class mang2chieu {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("nhap so cot");
		int soCot = scan.nextInt();
		System.out.println("nhap so hang");
		int soHang = scan.nextInt();
		int arr[][] = new int [soHang][soCot];
		System.out.println("nhap phan tu");
		for(int i = 0 ;i<soHang ; i++) {
			for(int j = 0 ; j<soCot ; j++) {
				System.out.printf("arr[%d][%d] = ",i,j);
				arr[i][j] = scan.nextInt();
			}
		}
		System.out.println("mang ban dau la :");
		for(int i = 0 ;i<soHang ; i++) {
			System.out.println();
			for(int j = 0 ; j<soCot ; j++) {
				System.out.print(arr[i][j]+"\t");
			}
		}
		int temp;
		for(int k = 0 ; k < soHang ; k++) {
			for(int i = 0 ; i < soCot-1 ; i++) {
				for(int j = i+1 ; j<soCot ; j++) {
					if(arr[k][i]>arr[k][j]) {
						temp = arr[k][i];
						arr[k][i] = arr[k][j];
						arr[k][j] = temp;
					}
				}
			}
			
		}
		System.out.println("\nmang sau khi sap xep theo thu tu tang dan la :");
		for(int i = 0 ;i<soHang ; i++) {
			System.out.println();
			for(int j = 0 ; j<soCot ; j++) {
				System.out.print(arr[i][j]+"\t");
			}
		}
	}

}

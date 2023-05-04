import java.util.ArrayList;
import java.util.Scanner;

public class Slide22 {
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();
		System.out.println("nhap so phan tu cua array list");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for(int i = 0 ; i<n;i++) {
			System.out.println("nhap phan tu thu "+i);
			arr.add(i, scan.nextInt());
		}
		int max , min;
		max = arr.get(0);min = arr.get(0);
		for(int  i = 0 ; i <n;i++) {
			if(arr.get(i)<min) min = arr.get(i);
			if(arr.get(i)>max) max = arr.get(i);
		}
		System.out.println("phan tu lon nhat cua array list la "+max);
		System.out.println("phan tu nho nhat cua array list la "+min);
	}

}

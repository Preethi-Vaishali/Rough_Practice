import java.util.Scanner;
import basicLogic.*;

public class BubbleSort {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Logics l = new Logics();
		int n = s.nextInt();
		int a[]= new int[n];
		System.out.println("Enter array elements: ");
		for(int i =0; i<n; i++)
			a[i]=s.nextInt();
		l.bubbleSort(a);
	}

	
}

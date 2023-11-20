import java.util.Scanner;

import basicLogic.Logics;

public class Even_Odd {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Logics l = new Logics();
		int n = s.nextInt();
		int a[]= new int[n];
		System.out.println("Enter array elements: ");
		for(int i =0; i<n; i++)
			a[i]=s.nextInt();
		System.out.println("Even Numbers are: "+l.evenArr(a, n));
		System.out.println("Enter the no. to find even or odd : ");
		int num=s.nextInt();
		System.out.println("The given num "+num+" is Even: "+l.evenArr(num));

	}

}

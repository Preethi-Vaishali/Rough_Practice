import java.util.ArrayList;
import java.util.Scanner;

import basicLogic.Logics;

public class Prime_Number {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		ArrayList<Integer> ar= new ArrayList<Integer>();
		Logics l = new Logics();
		int n = s.nextInt();
		int a[]= new int[n];
		System.out.println("Enter array elements: ");
		for(int i =0; i<n; i++)
			a[i]=s.nextInt();
		
		ar=l.primeNum(a);
		System.out.println("Prime Nums are: "+ ar);
		System.out.println("Enter the no. to find prime or not: ");
		int num=s.nextInt();
		System.out.println("The given num "+num+" is prime: "+l.primeNum(num));
		
	}

}

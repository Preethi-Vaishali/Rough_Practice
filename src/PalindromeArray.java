import java.util.Scanner;
import basicLogic.Logics;

public class PalindromeArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Logics l = new Logics();
		int n = sc.nextInt();
		String a[]= new String[n];
		System.out.println("Enter array elements: ");
		for(int i =0; i<n; i++)
			a[i]=sc.next();
		System.out.println("Palindromes are: "+Logics.palindromeCheck(a));
		
		System.out.println("Enter the string to check palindrome : ");
		String s= sc.next();
		System.out.println("The given string "+ s+" is palindrome? "+ Logics.isPalindrome(s));
sc.close();
    }

 

       
    }


package basicLogic;

import java.util.ArrayList;

public class Logics {
	public static void bubbleSort(int[] a) {
		int temp;
		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length; j++) {
				if(a[i]<a[j]) {
					temp = a[j];
					a[j] = a[i];
					a[i] = temp;
				}
			}
		}
		System.out.println("Array Elements after sorting are: ");
		for(int i=0; i<a.length; i++)
			System.out.print(a[i]+" ");	
	}
	
	 public ArrayList<Integer> primeNum(int a[]) {
		 ArrayList<Integer> ar= new ArrayList<Integer>();
	    	int c=0, c1=0;
	    	int count =0;
	    	for(int i=0; i<a.length; i++) {
	    		c=c+1;
				for(int j=2; j<a[i]; j++) {
					c1=c1+1;
					if(a[i]%j==0) {
						count++;
					}
					
				}
				if(count==0) {
					ar.add(a[i]);
				}
				count = 0;
	    	
	    	}
	    	//System.out.println("j Loop : "+c1);
	    	//System.out.println("i Loop : "+c);
	    	return ar;
	 }
	 
	 public boolean primeNum(int n) {
	    	//int prime =0;
	    	int count =0;
	    	for(int i=2; i<=n/2; i++) {
					if(n%i==0) {
						count++;
						break;
					}
					
				}
				if(count==0 && n!=1) 
					return true;
				
				else
					return false;
	 }
	 
	 public ArrayList<Integer> evenArr(int a[],int n){
		 ArrayList<Integer> even = new ArrayList<Integer>();
		int o=0;
		 for(int i=0; i<a.length; i++) {
			 if(a[i]%2==0) {
				 even.add(a[i]);
				
			 }
			 else {
				o=o+1;
			 }
		 }
		 if(o!=0) {
			 System.out.println("Odd Numbers are : "+ evenArr(a));
		 }
		 return even;
	 }
	 
	 public static ArrayList<Integer> evenArr(int a[]){
		 ArrayList<Integer> odd = new ArrayList<Integer>();
		 for(int i=0; i<a.length; i++) {
			 if(a[i]%2!=0) {
				odd.add(a[i]);
			 }
		 }
		 return odd;
	 }
	 
	
	 public boolean evenArr(int a){
			int e=0;
			 //int even=0;
				 if(a%2==0) {
					e++;
				 }
				 if(e==0)
					 return false;
				 else
					 return true;
		 }
	 
	 public static ArrayList<String> palindromeCheck(String a[]){
		 ArrayList<String> st = new ArrayList<String>();
		 {
		 for (String str : a) {
	            if (isPalindrome(str)) {
	                st.add(str);
	            }
	        }
		 return st;
	 }
	 }
	  public static boolean isPalindrome(String str) {
	        str = str.toLowerCase();
	        int left = 0;
	        int right = str.length() - 1;

	        while (left < right) {
	            if (str.charAt(left) != str.charAt(right)) {
	                return false; 
	            }
	            left++;
	            right--;
	        }
	        return true; 
	  }
}

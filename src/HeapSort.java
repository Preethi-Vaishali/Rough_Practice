import java.util.Scanner;

public class HeapSort {
	static void sortHeap(int a[], int n) {
		int max_ind, t;
		for(int step = n-1; step>0; step--) {
			max_ind = step;
			for(int i=step-1; i>=0; i--) {
				if(a[i]>a[max_ind]) {
					max_ind=i;
				}
			}
			t = a[step];
			a[step]= a[max_ind];
			a[max_ind] =t;
		}
	}
	static void printSort(int arr[], int n) {
		for(int i=0;i<n;i++)
			System.out.print(arr[i]+" ");
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number of elements: ");
		int n = s.nextInt();
		int arr[]=new int[n];
		System.out.print("Enter the array elements one by one: ");
		for(int i=0;i<n;i++)
			arr[i]=s.nextInt();
		sortHeap(arr,n);
		printSort(arr,n);
		s.close();
	}

}

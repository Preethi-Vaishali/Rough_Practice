import java.util.Scanner;

public class QuickSort {
	static void swap(int i, int j) {
		int t=i; 
		i=j;
		j=t;
	}
	static int partition(int a[], int low, int high) {
		int pivot= a[high];
		int t, i=(low-1);
		for(int j=low; j<=high -1; j++) {
			if(a[j]<=pivot) {
				i++;
				t = a[i];
				a[i]=a[j];
				a[j]=t;
			}
		}
		t = a[i+1];
		a[i+1] = a[high];
		a[high] = t;
		return i+1;
	}
	static void quickSort(int a[], int low, int high) {
		if(low<high) {
		int pi = partition(a,low,high);
		quickSort(a,low,pi-1);
		quickSort(a,pi+1,high);
	}
}
	static void printArray(int arr[], int n) {
		 for(int i=0; i<n; i++) {
			 System.out.print(arr[i]+" "); 
		 }
	 }
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int arr[] = new int[n];
		for(int i =0; i<n; i++) {
			arr[i] =s.nextInt();
		}
		 quickSort(arr,0,n-1);
		 System.out.println("Sorted Array: ");
		 printArray(arr, n);
		 s.close();

	}

}

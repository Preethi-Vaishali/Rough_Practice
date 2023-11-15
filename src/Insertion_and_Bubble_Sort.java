import java.util.Scanner;

public class Insertion_and_Bubble_Sort {
	static void sortInsert(int arr[], int n) {
		int key,t;
		for(int step =1; step<n; step++) {
			key = step;
			for(int i= step-1; i>=0; i--) {
				if(arr[i]>arr[key]) {
				t=arr[i];
				arr[i]=arr[key];
				arr[key] = t;
				key--;
			}
		}
	}
}
	static void sortBubble(int arr[], int n) {
		int t;
		for(int step=1; step<n; step++) {
			for(int i=0; i<n-1; i++) {
				if(arr[i]>arr[i+1]) {
				t = arr[i];
				arr[i] = arr[i+1];
				arr[i+1]= t;
			}
		}
	}
}
	static void printSort(int arr[], int n) {
		System.out.println();
		System.out.print("Sorted Array: ");
		for(int i=0; i<n; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
		 int n = s.nextInt();
		 int ar[] = new int[n+1];
		System.out.print("Enter the array elements one by one: ");
		for (int i=0; i<n; i++)
			ar[i] = s.nextInt();
		sortInsert(ar,n);
		printSort(ar,n);
		sortBubble(ar,n);
		printSort(ar,n);
		s.close();

	}

}

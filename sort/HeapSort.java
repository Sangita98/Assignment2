package datastructure.sort;

public class HeapSort {
	
	static void heapSort(int arr[]) {
		int N =arr.length;
		
		//Build heap
		
		for(int i =N/2-1;i>=0; i--) {
			heapify(arr,N,i);
		}
		
		// One by one extract an element from heap
		for(int i=N-1; i>0;i--) {
			// Move current root to end
			int temp= arr[0];
			arr[0]=arr[i];
			arr[i]=temp;
			
			// Call max heapify on the reduced heap
			heapify(arr,i,0);
		}
	
	}
	private static void heapify(int[] arr, int N, int i) {
		// TODO Auto-generated method stub
		int largest =i;
		int l =2*i+1;
		int r=2*i+2;
		
		// If left child is larger than root
		if(l<N && arr[l] > arr[largest]) {
			largest =l;
		}
		
		// If right child is larger than largest so far
		if(r<N && arr[r] > arr[largest]) {
			largest =r;
		}
		
		// If largest is not root
		if(largest !=i) {
			int swap =arr[i];
			arr[i]=arr[largest];
			arr[largest]=swap;
			
			// Recursively heapify the affected sub-tree
			heapify(arr, N, largest);
		}
		
		
	}
	
	public static void printArray(int[] arr) {
	for(int i=0; i<arr.length;++i) {
		System.out.print(arr[i] + " ");
	}
	System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {88, 45, 99, 5, 6, 7};
		
		heapSort(arr);
		System.out.println("\n sorted array is:");
		printArray(arr);
		

	}
}

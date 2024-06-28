package assignment;

public class HeapSort_11 {

	public void sort(int arr[]) {
		int n = arr.length;
		
		 for(int i=n /2 - 1; i>=0; i--)
			 heapify(arr,n,i);
	
	
		for(int i=n-1; i>= 0; i--) {
			
			int temp =arr[0];
			arr[0] =arr[i];
			arr[i] =temp;
			
			heapify(arr, i, 0);;
		}
}
	
	 void heapify(int[] arr, int n, int i) {
		 int largest =i;
		 int left =2 *i + 1;
		 int right = 2 * i + 2;
		 
		 if(left < n && arr[left] > arr[largest])
			 largest =left;
		 
		 if(right < n && arr[right] > arr[largest])
			 largest = right;
		 
		 if(largest != i ) {
			 int swap = arr[i];
			 arr[i]= arr[largest];
			 arr[largest] = swap;
		 }
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {12,11,13,5,7,9};
		int n = arr.length;
		
		HeapSort_11 hs =new HeapSort_11();
		hs.sort(arr);
		
		System.out.println("sorted areray is");
		for(int i : arr) {
			System.out.print(i + " ");
			
	}

}
}

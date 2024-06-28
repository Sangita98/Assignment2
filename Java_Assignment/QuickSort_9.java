package assignment;

public class QuickSort_9 {
	
	private static int Partition(int[] array, int low, int high) {
		int pivot = array[high];
		int i= (low -1);
		
		for(int j=low; j<high; j++) {
			if(array[j] <= pivot) {
				i++;
				
				int temp= array[i];
				array[i] = array[j];
				array[j] = temp;
			}
		}
		
		int temp = array[i+1];
		array[i+1]= array[high];
		array[high]=temp;
		
		return i+1;
	}
	
	
	 private static void quickSort(int[] array, int low, int high) {
	        if (low < high) {
	            int pi = Partition(array, low, high);

	            quickSort(array, low, pi - 1);
	            quickSort(array, pi + 1, high);
	        }
	    }
	private static void printArray(int[] array) {
		for(int value : array) {
			System.out.println(value + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {10,7,8,9,1,5};
		int n= array.length;
		
		System.out.println("Unsorted array:");
		printArray(array);
		
		quickSort(array, 0, n-1);
		
		System.out.println("Sorted array:");
		printArray(array);
	}

	

}

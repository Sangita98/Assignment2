package datastructure.search;

public class BinarySearch {

	
	static int binarySearch(int arr[],int x) {
		int low=0,high=arr.length-1;
		while(low<=high) {
			int mid=low + (high-low)/2;
			//check if x is present at mid
			if(arr[mid]==x) 
			return mid;
		
		//if x is grater .ignore left half
		if(arr[mid]<x) 
			low= mid+1;
		
		////if x is smaller .ignore left half
		else  
			high=mid -1;
			
		}return-1;
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,20,30,40,50};
		int x= 40;
		int result =binarySearch(arr,x);
		if(result==-1) {
		System.out.println("Element is not present in array");
		}else
			System.out.println("Element is present at index " + result);
	}

}

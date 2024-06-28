package assignment;

public class LinearSearch_5 {
	
	public static int linearSearch(int[] array, int target) {
		for(int i=0; i< array.length; i++) {
			if(array[i] == target) {
				return i;
			}
		}
			return -1;
		
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] number = {1,30,50,7,9,100};
		int target =100;
		
		int result = linearSearch(number, target);
		
		if(result !=result -1) {
			System.out.println("Target found at index: " +result);
		} else {
			System.out.println("Target not found in the array. ");

		}
	}

}

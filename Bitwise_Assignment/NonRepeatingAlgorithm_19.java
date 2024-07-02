
//Task 2: Unique Elements Identification
//Given an array of integers where every element appears twice except for two, write a function that 
//efficiently finds these two non-repeating elements using bitwise XOR operations.

package assignment;
public class NonRepeatingAlgorithm_19 {

	public static void findNonReating(int[] arr) {
		int xor= 0;
		for(int num: arr) {
			xor ^=num;
			
		}
		int setBit =xor & -xor;
		int x=0, y=0;
		
		for(int num : arr) {
			if((num & setBit)==0) {
				x ^=num;
			} else {
				y ^=num;
			}
		}
		
		System.out.println("The non repeating element are: " + x + " and " +y);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {4,1,2,1,2,3,4,5};
		findNonReating(arr);
	}

}

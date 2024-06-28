package assignment;

public class JumpSearch_7 {
	
	public static int jumpSearch(int[]arr, int target) {
		int n = arr.length;
		int step = (int)Math.floor(Math.sqrt(n));
		
		int prev =0;
		while(arr[Math.min(step, n)-1] < target) {
			prev = step;
			step += (int) Math.floor(Math.sqrt(n));
			if(prev >= n) {
				return -1;
			}
		}
		
		while(arr[prev] < target) {
			prev++;
			if(prev == Math.min(step, n)) {
				return -1;
			}
		}
		
		if(arr[prev] == target) {
			return prev;
		}
		
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,3,5,7,9,11,13,15,17,19};
		int target =11;
		int index =jumpSearch(arr, target);
		
		if(index != -1) {
			System.out.println("Element "+target +  " found at index " + index+ ".");

		}else {
			System.out.println("Element "+target + " not found in the array.");

		}
		}
	}



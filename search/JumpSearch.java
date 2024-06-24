package datastructure.search;

public class JumpSearch {

    static int jumpSearch(int[] arr, int x) {
        int n = arr.length;
        int step = (int) Math.floor(Math.sqrt(n));
        int prev = 0;
        
        System.out.println("Array length is: " + n);
        System.out.println("Step value is: " + step);
        
        // Finding the block where element is present (if it is present)
        while (arr[Math.min(step, n) - 1] < x) {
            prev = step;
            System.out.println("prev is: " + prev);
            step += (int) Math.floor(Math.sqrt(n));
            System.out.println("step is: " + step);
            
            if (prev >= n) {
                System.out.println("Prev is: " + prev);
                return -1;
            }
        }
        
        System.out.println("------------");
        
        // Doing a linear search for x in block beginning with prev
        while (prev < n && arr[prev] < x) {
            prev++;
            System.out.println("within while prev is: " + prev);
            
            if (prev == Math.min(step, n)) {
                System.out.println("within while - if: " + prev);
                return -1;
            }
        }
        
        // If element is found
        if (prev < n && arr[prev] == x) {
            System.out.println("if equals: " + prev);
            return prev;
        }
        
        System.out.println("Iteration end: ");
        System.out.println("------------");
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610};
        int x = 55;
        
        int index = jumpSearch(arr, x);
     
        if (index != -1)
            System.out.println("Number " + x + " is at index " + index);
        else
            System.out.println("Number " + x + " is not present in the array");
    }
}

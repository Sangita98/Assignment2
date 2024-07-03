
// Day 13 and 14:
//Task 1: Tower of Hanoi Solver
//Create a program that solves the Tower of Hanoi puzzle for n disks. The solution should use recursion to move disks between three pegs 
//(source, auxiliary, and destination) according to the game's rules. The program should print out each move required to solve the puzzle.

package computationalalgorithm;
public class TowerOfHanoi {

	public static void solveTowerOfHanoi(int n, char sourceRod,char targetRod, char auxiliaryRod) {
		if(n==1) {
			System.out.println("Move disk 1 from rod " +sourceRod + " to rod " + targetRod);
			return;
		}
		
		solveTowerOfHanoi(n-1, sourceRod, auxiliaryRod, targetRod);
		
		System.out.println("Move disk " + n + " from rod " + sourceRod + " to rod " + targetRod);
		
		solveTowerOfHanoi(n-1,auxiliaryRod,targetRod, sourceRod  );
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numberOfDisks = 3;
		solveTowerOfHanoi(numberOfDisks,'A', 'C', 'B');
	}

}

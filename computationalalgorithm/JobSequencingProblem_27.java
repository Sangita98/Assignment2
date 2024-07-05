// Define a class Job with properties int Id, int Deadline, and int Profit. Then implement a function List<Job> 
//JobSequencing(List<Job> jobs) that takes a list of jobs and returns the maximum profit sequence of jobs that 
//can be done before the deadlines. Use the greedy method to solve this problem.

package assignment;

import java.util.ArrayList;
import java.util.Collections;
	public class JobSequencingProblem_27 {

	char id;
	int deadline,profit;
	
	public JobSequencingProblem_27(char id, int deadline, int profit) {
		super();
		this.id = id;
		this.deadline = deadline;
		this.profit = profit;
	}
	
void printJoobScheduleling(ArrayList<JobSequencingProblem_27> arr, int t) {
		int n =arr.size();
		Collections.sort(arr, (a,b) -> b.profit-a.profit);
		boolean result[] =new boolean[t];
		
		char job[]=new char[t];
		
		for(int i=0; i<n; i++) {
			for(int j=Math.min(t-1, arr.get(i).deadline-1);j>=0; j--) {
				if(result[j]==false) {
					result[j]=true;
					job[j]=arr.get(i).id;
					break;
				}
			}
		}
		
		for(char jb:job) {
			if(jb !=0) {
			System.out.print(jb + " ");
		}
	
	}
	System.out.println();

}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<JobSequencingProblem_27> arrayList=new ArrayList<JobSequencingProblem_27>();
		
		arrayList.add(new JobSequencingProblem_27('a', 2, 100));
		arrayList.add(new JobSequencingProblem_27('b', 1, 19));
		arrayList.add(new JobSequencingProblem_27('c', 2, 27));
		arrayList.add(new JobSequencingProblem_27('d', 1, 25));
		arrayList.add(new JobSequencingProblem_27('e', 3, 15));
		
		JobSequencingProblem_27 jps= new JobSequencingProblem_27(' ', 0, 0); 
		jps.printJoobScheduleling(arrayList, 3);

	}

}

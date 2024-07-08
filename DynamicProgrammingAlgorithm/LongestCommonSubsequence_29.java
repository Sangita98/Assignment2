//Implement int LCS(string text1, string text2)  to find the length of the longest common subsequence between two strings.

package assignment;

public class LongestCommonSubsequence_29 {
	int lcs(char[] x, char[] y, int m,int n) {
		if(m == 0 || n==0)
			return 0 ;
		
		if(x[m-1] == y[n-1])
			return 1+ lcs(x, y, m-1, n-1);
			else 
				return max(lcs(x, y, m, n-1),lcs(x, y, m-1, n));
	}
	 int max(int a, int b) {
		return (a > b) ? a: b;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LongestCommonSubsequence_29 lc= new LongestCommonSubsequence_29();
		String s1 = "GoodMorning";
		String s2= "GoodEvening";
		
		char[] X =s1.toCharArray();
		char[] Y= s2.toCharArray();
		
		int m= s1.length();
		int n=s2.length();
		System.out.println("length of LCS is" +" " +lc.lcs(X, Y, m, n));
		
	}

}

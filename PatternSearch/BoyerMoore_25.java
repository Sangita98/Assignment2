//6 Boyer-Moore Algorithm Application	 
 	//Use the Boyer-Moore algorithm to write a function that finds the last occurrence of a substring in a given string and returns its index.
	//Explain why this algorithm can outperform others in certain scenarios.

package patternsearch;
import java.util.Arrays;

public class BoyerMoore {
	
	private final int R;
	private int[] right;
	private char[] pattern;
	private String pat;
	
	public BoyerMoore(String pat) {
		this.R = 256;
		this.pat = pat;
		right = new int[R];
		Arrays.fill(right, -1);
		for (int j = 0; j < pat.length(); j++) {
			right[pat.charAt(j)] = j;
		}
	}

	public BoyerMoore(int R, char[] pattern) {
		this.R = R;
		this.pattern = new char[pattern.length];
		this.pattern = Arrays.copyOf(pattern, pattern.length);
		right = new int[R];
		Arrays.fill(right, -1);
		for (int j = 0; j < pattern.length; j++) {
			right[pattern[j]] = j;
		}
	}

	public int search(String txt) {
		int M = pat.length();
		int N = txt.length();
		int skip;
		
		for (int i = 0; i <= N - M; i += skip) {
			skip = 0;
			for (int j = M - 1; j >= 0; j--) {
				if (pat.charAt(j) != txt.charAt(i + j)) {
					skip = Math.max(1, j - right[txt.charAt(i + j)]);
					break;
				}
			}
			if (skip == 0) return i;
		}
		return N;
	}

	public static void main(String[] args) {
		String pat = "example";
		String txt = "here is a simple example";
		
		BoyerMoore bMoore = new BoyerMoore(pat);
		int position = bMoore.search(txt);
		
		if (position == txt.length()) {
			System.out.println("Pattern not found");
		} else {
			System.out.println("Pattern found at position: " + position);
		}
	}
}

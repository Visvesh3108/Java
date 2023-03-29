import java.util.Arrays;
public class findmatchingsubsquence {
    
// Memoization DP function to find the number of times
// the second string occurs in the first string,
// whether continuous or discontinuous
public static int count(String a, String b, int m, int n,
						int[][] dp)
{
	
	// If both first and second string is empty,
	// or if second string is empty, return 1
	if ((m == 0 && n == 0) || n == 0)
	return 1;

	// If only first string is empty and second
	// string is not empty, return 0
	if (m == 0)
	return 0;

	if (dp[m][n] != -1) {
	return dp[m][n];
	}
	
	// If last characters are same
	// Recur for remaining strings by
	// 1. considering last characters of both strings
	// 2. ignoring last character of first string
	if (a.charAt(m - 1) == b.charAt(n - 1))
	return dp[m][n] = count(a, b, m - 1, n - 1, dp)
	+ count(a, b, m - 1, n, dp);
	else
	
	// If last characters are different, ignore
	// last char of first string and recur for
	// remaining string
	return dp[m][n] = count(a, b, m - 1, n, dp);
}

public static void main(String[] args) {
	String a = "GeeksforGeeks";
	String b = "Gks";
	int[][] dp = new int[a.length() + 1][b.length() + 1];
	for (int[] row : dp)
	Arrays.fill(row, -1);
	System.out.println(count(a, b, a.length(), b.length(), dp));
}
}

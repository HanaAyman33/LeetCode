/*Given the two integers m and n, return the number of possible unique paths that
 *  the robot can take to reach the bottom-right corner.
 */
import java.util.*;
public class UniquePath1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt(),n = sc.nextInt();
		System.out.println(uniquePaths(m,n));
	}
	public static int uniquePaths(int m, int n) {
		if(m==1 && n==1)
			return 1;
        int[][] dp = new int[m][n];
        for(int j = 0;j<n;j++)
        	dp[m-1][j] = 1;
        for(int i = 0;i<m;i++)
        	dp[i][n-1] = 1;
        for(int i = m-2;i>=0;i--) {
        	for(int j = n-2;j>=0;j--) {
        		dp[i][j] = dp[i+1][j]+dp[i][j+1];
        	}
        }
        return dp[0][0];	
        	
    }
	/*public static int uniquePaths(int m, int n) {
        int[][] dp = new int[m+1][n+1];
        for(int[] arr : dp) {
            Arrays.fill(arr, -1);
        }
        return helper(m, n, dp);
    }
    private static int helper(int m, int n, int[][] dp) {
        if(m == 1 && n == 1) {
            return 1;
        } 

        if(dp[m][n] != -1) {
            return dp[m][n];
        }

        int count = 0;
        if(m >= 1) {
            count += helper(m-1, n, dp);
        }
        
        if(n >= 1) {
            count += helper(m, n-1, dp);
        }

        return dp[m][n] = count;
    }*/
}

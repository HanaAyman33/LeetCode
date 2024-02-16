/*Given a m x n grid filled with non-negative numbers, 
 * find a path from top left to bottom right, which minimizes the sum 
 * of all numbers along its path.

Note: You can only move either down or right at any point in time.
 */
import java.util.*;
public class MinimumPathSum {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();	//# of rows
		int n = sc.nextInt();	//# of columns
		int[][] grid = new int[m][n];
		for(int i = 0;i<m;i++) {
			for(int j = 0;j<n;j++)
				grid[i][j] = sc.nextInt();
		}
		System.out.println(minPathSum(grid));
	}
	public static int minPathSum(int[][] grid) {
		int r = grid.length,c = grid[0].length;
        int[][] res = new int[r][c];
        res[r-1][c-1] = 0;
        for(int i = r-1;i>=0;i--) {
        	for(int j = c-1;j>=0;j--) {
        		if(i==r-1 && j==c-1)
        			res[i][j] = grid[i][j];
        		else if(i==r-1)
        			res[i][j] = grid[i][j] + res[i][j+1];
        		else if(j==c-1)
        			res[i][j] = grid[i][j] + res[i+1][j];
        		else
        			res[i][j] = grid[i][j] + Math.min(res[i][j+1], res[i+1][j]);
        	}
        }
        return res[0][0];
    }
}

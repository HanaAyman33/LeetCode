import java.util.*;
/*You are climbing a staircase. It takes n steps to reach the top.
Each time you can either climb 1 or 2 steps. In how many distinct 
ways can you climb to the top? 
 */
public class ClimbingStairs {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(climbStairs(n));
	}
	public static int climbStairs(int n) {
        if(n==0 || n==1)
            return 1;
        int[] arr = new int[n+1];
        arr[0] = 1;
        arr[1] = 1;
        for(int i = 2;i<=n;i++)
            arr[i] = arr[i-1]+arr[i-2];
        return arr[n];
    }
}

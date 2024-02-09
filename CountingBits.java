/*Given an integer n, return an array ans of length n + 1 
 * such that for each i (0 <= i <= n),
 *  ans[i] is the number of 1's in the binary representation of i.
 */
import java.util.*;
public class CountingBits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		display(countBits(n));
	}
	public static int[] countBits(int n) {
        int[] ans = new int[n+1];
        ans[0] = 0;
        if(n==0)
        	return ans;
        ans[1] = 1;
        if(n==1)
        	return ans;
        for(int i = 2;i<n+1;i++)
        	ans[i] = binary(i);
        return ans;
    }
	public static int binary(int n) {
		int ones = 0;
		while(n!=0) {
			if(n%2==1)
				ones++;
			n/=2;
		}
		return ones;
	}
	public static void display(int[] a) {
		for(int i = 0;i<a.length;i++)
			System.out.print(a[i]+" ");
	}
}

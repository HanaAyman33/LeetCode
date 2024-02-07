import java.util.*;
/*The Fibonacci numbers, commonly denoted F(n) form a sequence, 
 * called the Fibonacci sequence, such that each number 
 * is the sum of the two preceding ones, starting from 0 and 1. 
 * That is,
			F(0) = 0, F(1) = 1
			F(n) = F(n - 1) + F(n - 2), for n > 1.
	Given n, calculate F(n).
 */
public class FibonacciNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(fib(n));
	}
	 public static int fib(int n) {
	        List<Integer> tmp = new ArrayList();
	        tmp.add(0);
	        tmp.add(1);
	        if(n==0)
	            return tmp.get(0);
	        if(n==1)
	            return tmp.get(1);
	        for(int i = 2;i<=n;i++)
	            tmp.add(tmp.get(i-1)+tmp.get(i-2));
	        return tmp.get(n);
	    }
}

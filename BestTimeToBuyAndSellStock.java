/*You are given an array prices where prices[i] is the price of 
 * a given stock on the ith day.
You want to maximize your profit by choosing a single day to buy 
one stock and choosing a different day in the future to sell that stock.
Return the maximum profit you can achieve from this transaction.
 If you cannot achieve any profit, return 0.
 */
import java.util.*;
public class BestTimeToBuyAndSellStock {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //length of the array
		int[] prices = new int[n];
		for(int i = 0;i<n;i++)
			prices[i] = sc.nextInt();
		System.out.println(maxProfit(prices));
	}
	public static int maxProfit(int[] prices) {
		int down = Integer.MAX_VALUE;
		int up = Integer.MIN_VALUE;
		int profit = 0;
		for(int i = 0;i<prices.length;i++) {
			down = Math.min(down, prices[i]);
			profit = prices[i]-down;
			up = Math.max(up, profit);
		}
		return up;
    }
}

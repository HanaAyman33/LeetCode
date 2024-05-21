//Using recursion, given an integer n, print a triangle of n lines,each line consists 
//of stars corresponding to the line number
import java.util.*;
public class PrintTraingle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		printTriangle(n);

	}
	public static void printTriangle(int n) {
		if(n==0)
			return;
		printTriangle(n-1);
		helper(n);
		System.out.println();
		
	}
	public static void helper(int n) {
		if(n==0)
			return;
		System.out.print("*");
		helper(n-1);
	}

}

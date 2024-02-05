import java.util.*;
/*Given an integer numRows, return the first numRows of Pascal's triangle.
In Pascal's triangle, each number is the sum of 
the two numbers directly above it 
 */
public class PascalTriangle1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(generate(n));
	}
	public static List<List<Integer>> generate(int n) {
        List<List<Integer>> ans  = new ArrayList<>();
        List<Integer> t1 = new ArrayList<>();//[1] => 1st row
        List<Integer> t2 = new ArrayList<>();//[1,1] => 2nd row
        t1.add(1);
        ans.add(t1);
        if(n==1)
            return ans;
        t2.add(1);
        t2.add(1);
        ans.add(t2); 
        if(n==2)
            return ans;
        for(int i = 2;i<n;i++){
            List<Integer> tmp = new ArrayList<>();
            tmp.add(1);
            for(int j = 1;j<=i-1;j++)
                tmp.add(ans.get(i-1).get(j-1) + ans.get(i-1).get(j));
            tmp.add(1);
            ans.add(tmp);
        }
        return ans;
    }
}

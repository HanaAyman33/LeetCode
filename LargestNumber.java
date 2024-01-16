import java.util.*;
//gicen an array of positive integers,return the largest number possible
//formed from them(put the result in string as it may not fit in an integer
public class LargestNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = {3,30,34,5,9};
		String s = "";
		for(int i = 0;i<a.length;i++)
			s+=a[i]+"";
		char[] tmp = s.toCharArray();
		Arrays.sort(tmp);
		s = "";
		for(int i = tmp.length-1;i>=0;i--)
			s+=tmp[i]+"";
		System.out.println(s);
		/*//another better solution
		 *  String[] s = new String[nums.length];         
        for(int i=0; i<nums.length; i++)  s[i] = String.valueOf(nums[i]);
        Arrays.sort(s, (a,b) -> (b + a).compareTo(a + b));
        return s[0].equals("0") ? "0" : String.join("",s);
		 */
	}
}

/*
 * given a string, return the longest palindrome in it.
 */
import java.util.*;
public class LongestPalindromeSubstring {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.println(longestPalindrome(s));
	}
	public static String longestPalindrome(String s) {
        if(s.length()<=1)
            return s;
        if(s.length()==2){
            if(s.charAt(0)!=s.charAt(1))
                return s.charAt(0)+"";
            return s;
        }
        String res = "";
        int tmp = 0;
        for(int i = 0;i<s.length();i++) {
        	for(int j = s.length()-1;j>i;j--) {
        		if(s.charAt(i)==s.charAt(j) && j-i>tmp && isPalindrome(s.substring(i,j+1))) {
        			res = s.substring(i,j+1);
        			tmp = j-i;
        		}
        	}
        }
        if(res=="")
        	return s.charAt(0)+"";
        return res;
    }
	public static boolean isPalindrome(String s) {
		for(int i = 0,j = s.length()-1;j>=0 && i<s.length() && (i<j || i!=j);i++,j--) {
			if(s.charAt(i)!=s.charAt(j))
				return false;
		}
		return true;
	}
}

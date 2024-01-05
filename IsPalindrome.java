import java.util.*;
public class IsPalindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = n+"";
		boolean flag = true;
		for(int i = 0,j = s.length()-1;i<s.length();i++,j--) {
			if(s.charAt(i)!=s.charAt(j)) {
				flag = false;
				break;
			}
		}
		System.out.println(flag);
	}
}

public class Subsequence {
	public static void main(String[] args) {
		String s = "axc",t = "ahbgdc";
		boolean flag = true;
		int i = 0,j = 0;
		while(i<s.length() && j<t.length()){
			if(s.charAt(i)==t.charAt(j))
				i++;
			j++;
		}
		if(i==s.length())
			flag = true;
		else
			flag = false;
		System.out.println(flag);
	}
}

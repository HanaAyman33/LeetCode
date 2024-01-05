public class FindTheDifference {
	public static char findTheDifference(String s, String t) {
		char c = ' ';
        /*for(int i = 0;i<t.length();i++){
            if(!s.contains(t.charAt(i)+"")) {
            	c = t.charAt(i);
            	break;
            }
        }
        if(c==' ') {
        	c = t.charAt(0);
        }*/
		for(int i = 0;i<t.length();i++) {
			if(occ(t,t.charAt(i))!=occ(s,t.charAt(i))) {
				c = t.charAt(i);
				break;
			}
		}
        return c;
    }
	public static int occ(String s,char c) {
		int cnt = 0;
		for(int i = 0;i<s.length();i++) {
			if(s.charAt(i)==c)
				cnt++;
		}
		return cnt;
	}
	public static void main(String[] args) {
		//System.out.println(findTheDifference("abcd","abcde"));
		System.out.println(findTheDifference("a","aa"));
	}
}

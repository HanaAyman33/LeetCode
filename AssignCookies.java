import java.util.Arrays;
public class AssignCookies {
	public static void main(String[] args) {
		int[] g = {1,2};
		int[] s = {1,2,3};
		System.out.println(findContentChildren(g,s));
	}
	public static int findContentChildren(int[] g, int[] s) {
		Arrays.sort(g);
	    Arrays.sort(s);
	    int cnt = 0;
	    int i = 0,j = 0;
	    while(i<g.length && j<s.length){
	        if(g[i]<=s[j]){
	            cnt++;
	            i++;
	            j++;
	        }
	        else
	        	j++;
	    }
	    return cnt;
    }
}

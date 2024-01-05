import java.util.Arrays;
import java.util.Hashtable;
public class LongestCommonPrefix {
	public static void main(String[] args) {
		/*String[] strs = {"flower","flow","flight"};
		Hashtable<String,Integer> h = new Hashtable<>(strs.length);
		int count = 0;
		for(int i = 0;i<strs.length;i++) {
			if(h.isEmpty())
				h.put(strs[i].substring(0,3), 0);
			else if(h.contains(strs[i].substring(0,3))) {
				count = h.get(strs[i].substring(0,3));
				h.remove(strs[i].substring(0,3));
				h.put(strs[i], count++);
			}
		}
		int max = 0;
		String p = "";
		for(int i = 0;i<strs.length;i++) {
			if(max<h.get(strs[i].substring(0,3))) {
				p = strs[i].substring(0,3);
				max = h.get(strs[i].substring(0,3));
			}
		}
		if(max==1)
			System.out.println("");
		else
			System.out.println(p);*/
	}
	public String longestCommonPrefix(String[] strs) {
	   Arrays.sort(strs);
	   String s1 = strs[0];
	   String s2 = strs[strs.length-1];
	   int idx = 0;
	   while(idx < s1.length() && idx < s2.length()){
	       if(s1.charAt(idx) == s2.charAt(idx))
	           idx++;
	       else
	           break;
	        }
	        return s1.substring(0, idx);
	}
}

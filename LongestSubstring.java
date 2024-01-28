/*Given a string s, find the length of the longest 
substring
 without repeating characters.
 */
public class LongestSubstring {
	public int lengthOfLongestSubstring(String s) {
        if(s.length()==1 || 
        (s.length()==2 && s.charAt(0)!=s.charAt(1))) 
            return s.length();
        String res = "",tmp = "";
        int i = 0;
        while(i<s.length()){
            tmp = "";
            for(int j = i;j<s.length();j++){
                if(!tmp.contains(s.charAt(j)+""))
                    tmp+=s.charAt(j)+"";
                else{
                    if(tmp.length()>res.length())
                        res = tmp;
                    break;
                }
            }
            if(tmp.length()>res.length())
                res = tmp;
            i++;
        }
        return res.length();
    }
}

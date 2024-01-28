/*You are given a positive integer num consisting only of digits 6 and 9.

Return the maximum number you can get by changing at most one digit 
(6 becomes 9, and 9 becomes 6).
 */
public class Maximum69Number {
	public int maximum69Number (int num) {
        String s = num+"";
        String res = "";
        boolean flag = false;
        for(int i = 0;i<s.length();i++){
            if(!flag && s.charAt(i)=='6'){
                res+="9";
                flag = true;
            }
            else
            res+=s.charAt(i)+"";
        }
        return Integer.parseInt(res);
    }

}

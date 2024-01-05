import java.util.Hashtable;
public class RomanToInteger {
	public static void main(String[] args) {
		Hashtable<Character, Integer> h = new Hashtable<>(7);
		h.put('I',1);
		h.put('V',5);
		h.put('X', 10);
		h.put('L',50);
		h.put('C',100);
		h.put('D',500);
		h.put('M',1000);
		int ans = 0;
		String s = "MCMXCIV";
		for(int i = 0;i<s.length();i++) {
			if(i<s.length()-1 && h.get(s.charAt(i))<h.get(s.charAt(i+1)))
				ans-=h.get(s.charAt(i));
			else
				ans+=h.get(s.charAt(i));
		}
		System.out.println(ans);
	}
}

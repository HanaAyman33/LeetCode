import java.util.Stack;
public class VaildParentheses {
	public static void main(String[] args) {
		String in = "()[]{}";
		Stack<Character> s = new Stack<Character>();
		for(int i = 0;i<in.length();i++) {
			if(s.isEmpty())
				s.add(in.charAt(i));
			else {
				if(((Character)s.peek()=='(' && in.charAt(i)==')')
		|| (((Character)s.peek()=='{' && in.charAt(i)=='}'))
		|| (((Character)s.peek()=='[' && in.charAt(i)==']')))
					s.pop();
				else
					s.add(in.charAt(i));
			}
		}
		System.out.println(s.size()==0?"true":"false");
	}
}

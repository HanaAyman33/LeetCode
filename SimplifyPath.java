import java.util.Stack;
public class SimplifyPath {
	public static void main(String[] args) {
		String path = "/a/./b/../../c/";
		Stack<Character> c = new Stack<Character>();
		char tmp = '/';
		c.add(tmp);
		int i = 1;
		while(i<path.length()-1) {
			if(c.isEmpty()) {
				c.add(path.charAt(i));
				i++;
			}
			else {
				if((Character)c.peek()=='/' && path.charAt(i)=='/')
					i++;
				if(path.charAt(i)=='.')
					i++;
				else {
					c.add(path.charAt(i));
					i++;
				}
			}
		}
		String res = "";
		while(!c.isEmpty())
			res = c.pop()+""+res;
		System.out.println(res);
		/*// using stringbuilders:- 
		 * split the path on /
        String[] splitPath = path.split("/");
        Stack<String> stack = new Stack<>();

        for(String dir : splitPath){
            // if we have . it means we're in the same folder. Continue
            // if we have "" it means we had a double slash //. Continue
            if(dir.equals(".") || dir.equals("")) continue;
            else if(dir.equals("..")){
                // if we have .. only pop is stack is not empty
                if(!stack.isEmpty()) stack.pop();
            } else stack.push(dir); // else we can push to stack
        }

        StringBuilder sb = new StringBuilder();
        
        // return / in case of root path
        if(stack.isEmpty()) return "/";
        
        for(String dir : stack){
            sb.append("/");
            sb.append(dir);
        }

        return sb.toString();*/
	}
}

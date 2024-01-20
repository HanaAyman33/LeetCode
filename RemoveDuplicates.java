import java.util.*;
/*Given a string s, remove duplicate letters so that 
 * every letter appears once and only once. 
 * You must make sure your result is
the smallest in lexicographical order
 among all possible results.
 */
public class RemoveDuplicates {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        String result = removeDuplicateLetters(s);
        System.out.println(result);
        input.close();
    }
    public static String removeDuplicateLetters(String s) {
        int n = s.length();
        int[] count = new int[26];
        boolean[] visited = new boolean[26];
        for (int i = 0; i < n; i++) {
            count[s.charAt(i) - 'a']++;
        }
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            count[c - 'a']--;
            if (visited[c - 'a']) {
                continue;
            }
            while (!stack.isEmpty() && stack.peek() > c
            		&& count[stack.peek() - 'a'] > 0) {
                visited[stack.peek() - 'a'] = false;
                stack.pop();
            }
            stack.push(c);
            visited[c - 'a'] = true;
        }
        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }
        return result.reverse().toString();
    }
}
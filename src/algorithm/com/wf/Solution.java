package algorithm.com.wf;

import java.util.HashMap;
import java.util.Stack;
/**
 * ¿®∫≈∆•≈‰    ’ª
 * @author Administrator
 *
 */
public class Solution {
	
	public HashMap<Character,Character> map = new HashMap<>();
	
	Solution(){
		this.map.put(')', '(');
		this.map.put(']', '[');
		this.map.put('}', '{');
	}
	
	public boolean isvalid(String s) {
		Stack<Character> stack = new Stack<Character>();
		for(int i=0;i<s.length();i++) {
			Character c = s.charAt(i);
			if(map.containsKey(c)) {//
				Character ch = stack.isEmpty()?'#':stack.pop();
				if(ch!=map.get(c)) {
					return false;
				}
			}else {
				stack.push(c);
			}
		}
		return stack.isEmpty();
	}

	public static void main(String[] args) {
		Solution s = new Solution();
		boolean b = s.isvalid("{{{()}}");
		System.out.print(b);
	}
}

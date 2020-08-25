package algorithm.com.wf;

import java.util.Stack;

/**
 * 棒球记分
 * + 表示前两轮有效得分和
 * D 表示前一轮得分两倍
 * C 最后一个回合得分无效应该被移除
 * @author Administrator
 *
 */
public class Bang {

	public int calPoints(String[] ops) {
		Stack<Integer> stack = new Stack<>();
		for(String s:ops) {
			if(s.equals("+")) {
				int b = stack.pop();
				int c = stack.peek();
				stack.push(b);
				stack.push(b+c);
			}else if(s.equals("D")) {
				stack.push(stack.peek()*2);
			}else if(s.equals("C")) {
				stack.pop();
			}else {
				stack.push(Integer.valueOf(s));
			}
		}
		int sum=0;
		while(!stack.empty()) {
			sum += stack.pop();
		}
		return sum;
	}
	
}

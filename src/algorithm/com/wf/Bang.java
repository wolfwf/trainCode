package algorithm.com.wf;

import java.util.Stack;

/**
 * ����Ƿ�
 * + ��ʾǰ������Ч�÷ֺ�
 * D ��ʾǰһ�ֵ÷�����
 * C ���һ���غϵ÷���ЧӦ�ñ��Ƴ�
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

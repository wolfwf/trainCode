package algorithm.com.wf;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

/**
 * num1是num2的子集，num1中每个元素在num2中对应位置右侧，如果存在比它大的元素返回true，否则返回false
 * @author Administrator
 *
 */
public class ArrayCompare {
	
	public static void solution(int[] num1,int[] num2) {
		List<Integer> array = new ArrayList<Integer>();
		int[] arr = new int[num1.length];
		Stack<Integer> stack = new Stack<>();
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		int count = num2.length;
		for(int i=0;i<count;i++) {
			while(!stack.isEmpty()&&stack.peek()<num2[i]) {
				map.put(stack.pop(), num2[i]);
			}
			stack.push(num2[i]);
		}
		for(int j=0;j<num1.length;j++) {
			if(map.containsKey(num1[j])) {
				array.add(map.get(num1[j]));
				arr[j]=map.get(num1[j]);
			}else {
				array.add(-1);
				arr[j]=-1;
			}
		}
		
	}
	
	public static void main(String[] args) {
		solution(new int[]{2,3,5,7},new int[]{3,5,6,7,2,1});
	}

}

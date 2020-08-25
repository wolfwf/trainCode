package algorithm.com.wf;

import java.util.HashMap;

/**
 *  数组中有一个数字的个数大于一半，找出这个数
 * @author Administrator
 *
 */
public class MuchNumber {

	/**
	 * hashmap 时间O(n)
	 * @param array
	 * @return
	 */
	public static int findNumber(int[] array) {
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		int len = array.length;
		for(int i=0;i<len;i++) {
			if(map.containsKey(array[i])) {
				map.put(array[i],map.get(array[i])+1);
				if(map.get(array[i])>(len/2)) {
					return array[i];
				}
			}else {
				map.put(array[i],1);
			}
		}
		
		return -1;
	}
	
	/**
	 * 
	 * @param args
	 */
	public static int twoNumber(int[] array) {
		int len = array.length;
		int result,time=0;
		result = array[0];
		for(int i=1;i<len;i++) {
			if(result==array[i]) {
				time++;
			}else {
				if(time>1) {
//					result=array[i];
					time--;
				}else {
					result=array[i];
					time=0;
				}
			}
		}
		if(time>0) {
			return result;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		System.out.print(twoNumber(new int[]{1,3,3,3,3,3,3,3,3,1,9,8,1}));
	}
	
}

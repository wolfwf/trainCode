package algorithm.com.wf;

import java.util.HashMap;
import java.util.Map;

public class SameNumber {
	
	public static int getNumber(int[] array) {
		int len = array.length;
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		for(int i=0;i<len;i++) {
			if(map.containsKey(array[i])) {
				return array[i];
			}else {
				map.put(array[i], array[i]);
			}
		}
		return -1;
	}
	

	public static void main(String[] args) {
		int[] array = new int[]{1,2,3,2,4,5,6,7};
		System.out.print(getNumber(array));
	}
}

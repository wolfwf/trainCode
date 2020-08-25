package algorithm.com.wf;

import java.util.Arrays;
import java.util.Comparator;

public class LowNumer {

	class compareStr implements Comparator<String>{
		@Override
		public int compare(String m, String n) {
			String mn = m+n,nm = n + m;
			return mn.compareTo(nm);
		}
		
	}
	
	public String solution(int[] array) {
		String result="";
		int len = array.length;
		String[] str = new String[len];
		for(int i=0;i<len;i++) {
			str[i] = String.valueOf(array[i]);
		}
		compareStr c = new compareStr();
		Arrays.sort(str,c);
//		Arrays.sort(str);
		
		for(String s:str) {
			result += s;
		}
		return result;
		
	}
	
	public static void main(String[] args) {
		LowNumer lb = new LowNumer();
		int[] a = new int[]{413,2,33,1,87,9};
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		System.out.print(lb.solution(new int[]{413,2,33,1,87,9}));
	}
	
}

package algorithm.com.wf;

import java.util.Arrays;

public class ChangeNumber {
	public static int[] solution(int[] array) {
		int i = 0;
		int j = array.length-1;
		while(i<j) {
			if(i<j&&(array[i]&1)==1) {
				i++;
			}
			if(i<j&&(array[j]&1)!=1) {
				j--;
			}
			if(i<j) {
				array[i]=array[i]+array[j];
				array[j]=array[i]-array[j];
				array[i]=array[i]-array[j];
			}
			
		}
		return array;
		
	}
	
	/**
	 * 对数组进行奇偶分组，奇数在前，偶数在后，分组后顺序不变
	 * @param args
	 */
	public static int[] changeNumber2(int[] array) {
		long start = System.currentTimeMillis();
		int even=0,odd=0;
		int len = array.length;
		while(even<len&&odd<len) {
			while(even<len&&((array[even]&1)!=0)) {
				even++;
			}
			odd = even+1;
			while(odd<len&&(array[odd]&1)==0) {
				odd++;
			}
			if(odd>=len) {
				break;
			}
			int temp = array[odd];
			for(int i=odd;i>even;i--) {
				array[i]=array[i-1];
			}
			array[even] = temp;
//			even++;
		}
		long end = System.currentTimeMillis();
		System.out.print(start-end);
		return array;
	}
	
	public static void main(String[] args) {
		int[] array = new int[5];
		for(int i=0;i<5;i++) {
			array[i]=i;
		}
		System.out.print(Arrays.toString(changeNumber2(array)));
	}
	

}

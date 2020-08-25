package algorithm.com.wf;

//最大子数组
public class MostSum {

	public static int sum(int[] array) {
		int len = array.length;
		int result = array[0];
		int sum =result;
		for(int i=1;i<len;i++) {
			sum = sum + array[i]>array[i]?sum+array[i]:array[i];
			if(sum>result) {
				result = sum;
			}
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		int[] array = {1,1,-5,4,-1,2,-3,9};
		System.out.print(sum(array));
	}
	
}

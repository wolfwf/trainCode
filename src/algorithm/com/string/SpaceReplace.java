package algorithm.com.string;

public class SpaceReplace {
	
	public static String replaceStr(String str) {
		String newStr = str.replace(" ", "20%");
		return newStr;
	}

	public static void main(String[] args) {
		System.out.print(replaceStr("we are famliy"));
	}
	
}

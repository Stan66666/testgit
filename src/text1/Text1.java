package text1;

import java.util.Scanner;

public class Text1 {

	public static void main(String[] args) {
		
		String str = new Scanner(System.in).nextLine();
		System.out.println(str.substring (0,3) + "****" + str.substring(7,11));//截取字符串
		
	}

}

package zuoye;

import java.util.Scanner;

public class Zuoye2 {

	public static void main(String[] args) {
		System.out.println("请输入字符串：");
		String str = new Scanner(System.in).nextLine();
		System.out.println("请输入子字符串：");
		String str1 = new Scanner(System.in).nextLine();
		String str2 = "";
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == str1.charAt(0)) {
				for (int j = i; j < str1.length(); j++) {
					str2 = str2 + str.charAt(j);
				}
				sum++;
				i = i + str2.length() - 1;
			}
		}
		System.out.println(str + "中有" + sum + "个" + str1);
	}
}

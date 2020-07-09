package zuoye;

import java.util.Scanner;

public class Zuoye3 {
	
	 public static void main(String[] args) {
        
	        String str = new Scanner(System.in).nextLine();
	        
	        int english = 0;
	        int chinese = 0;
	        int digit = 0;
	        
	        for(int i=0;i<str.length();i++)
	        {
	            char ch = str.charAt(i);
	            if(ch>='0' && ch<='9')
	            {
	                digit++;
	            }
	            else if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z'))
	            {
	                english++;
	            }
	            else
	            {
	                chinese++;
	            }
	        }
	        System.out.println("英文字母有： " + english + "汉字有： " + chinese + "数字有： "+digit);
	    }
	
}

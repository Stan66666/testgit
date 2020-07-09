package zuoye;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Zuoye1 {

	public static void main(String[] args) throws ParseException {
		
		System.out.println("输入北京时间,格式：yyyy-MM-dd HH:mm:ss");
		Calendar c = Calendar.getInstance();
		String sc = new Scanner(System.in).nextLine();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date d = sdf.parse(sc);
		c.setTime(d);
		
		c.add(Calendar.HOUR,-7 );
		System.out.println("巴黎时间为：" + c.get(Calendar.YEAR) + "年" + (c.get(Calendar.MONTH)+1) + "月" + c.get(Calendar.DATE) + "日"
				+ c.get(Calendar.HOUR) + "点" + c.get(Calendar.MINUTE) + "分" + c.get(Calendar.SECOND) + "秒");
		
		c.add(Calendar.HOUR,-5 );
		System.out.println("纽约时间为：" + c.get(Calendar.YEAR) + "年" + (c.get(Calendar.MONTH)+1) + "月" + c.get(Calendar.DATE) + "日"
				+ c.get(Calendar.HOUR) + "点" + c.get(Calendar.MINUTE) + "分" + c.get(Calendar.SECOND) + "秒");
	}

}

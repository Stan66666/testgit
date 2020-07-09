package day5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Text2 {
	
	public static void main(String[] args) {
		
		List l = new ArrayList();
		
		l.add(123);//添加一个元素到集合中
		l.add("Tom");
		l.add("Jerry");
		System.out.println(l);
		l.add(2, "and");//在指定位置加入一个元素
		System.out.println(l);
		for(int i = 0;i<l.size();i++) {
			System.out.println(l.get(i));//取集合中的元素
		}
		l.remove("Tom");
		l.remove("Jerry");
		System.out.println(l);
		System.out.println(l.isEmpty());
		
		Iterator it = l.iterator();//迭代器，获得游标
		while(it.hasNext()/*判断游标右边是否有元素*/) {
			Object o = it.next();//返回游标右边的元素，并且游标向右移动一位
			System.out.println(o);
		}
		//remove：删除游标左边元素，执行完next后，该操作只执行一次。
	}
}

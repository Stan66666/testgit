package day5;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Text3 {
	
	public static void main(String[] args) {
		
		Map m1 = new HashMap();//(一个键对应一个值，唯一性)
		m1.put("Tom", "Cat");//添加键与值
		m1.put("Jerry", "Mouse");
		
		Set s1 = m1.keySet();//得到映射中包含的键的set集合
		Iterator it = s1.iterator();
		
		while(it.hasNext()) {
			Object key = it.next();
			System.out.println(m1.get(key));//得到指定键的值
		}
	}
}

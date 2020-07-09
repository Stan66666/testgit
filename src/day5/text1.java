package day5;

import java.util.HashSet;
import java.util.Set;

public class text1 {

	public static void main(String[] args) {
		//定义一个存储对象的容器（set）
		Set s = new HashSet();//向上造型
		Set s1 = new HashSet();
		
		s.add(123);//添加一个元素到集合中
		s.add("Tom");
		s.add("Jerry");
		s1.addAll(s);
		System.out.println(s1);//将某个集合所有元素添加到另一个集合中
		System.out.println(s);
		System.out.println(s.size());//集合大小(元素数量)
		System.out.println(s.isEmpty());//判断集合是否为空
		System.out.println(s.contains(123));//判断某个元素是否在集合内
		s.remove(123);//从集合中移除一个元素
		System.out.println(s);
		System.out.println(s.size());
		System.out.println(s.contains(123));
		s.remove("Tom");
		s.remove("Jerry");
		System.out.println(s);
		System.out.println(s.isEmpty());
	}

}

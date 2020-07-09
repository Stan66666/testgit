package yuangongdaka;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Company {
	//立一个容器类Company.java，要新增人员、删除人员、查找人员、显示员工信息  4个方法,操作后要有提示信息；
    //要求定义“存放员工的容器”和“存放考勤日期及打卡信息的容器”2个容器(需使用泛型)；
	
	private Map<String,List<Dakainfo>> m = new HashMap<String,List<Dakainfo>>();
	private List<Employee> list = new ArrayList<Employee>();
	
	public void addEmployee(Employee e) {
		list.add(e);
		System.out.println("添加成功");
	}
	
	public Map<String, List<Dakainfo>> getMap(){
		return m;
	}
	
	public List<Employee> getList(){
		return list;
	}
	
	public void removeEmployee(int i) {
		if(list != null && !list.isEmpty()) {
			for(Employee emp:list) {
				if(emp.getID() == i) {
					list.remove(emp);
					System.out.println("员工删除成功");
					return;
				}
			}
			System.out.println("无此员工ID");
		}
	}
	
	public Employee findEmployee(int i) {
		if(list != null && !list.isEmpty()) {
			for(Employee e : list) {
				if(e.getID()==i) {
					return e;
				}
			}
		}
		return null;
	}
	
	public void displayEmployee() {
		if(m==null) {
			System.out.println("当前无员工名单");
		}else {
			for(Employee e : list) {
				System.out.println("姓名：" + e.getName() + "员工ID：" + e.getID());
			}
		}
	}
}

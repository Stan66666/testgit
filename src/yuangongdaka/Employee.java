package yuangongdaka;

public class Employee {
	//建立一个员工的实体类Employee.java，要求有员工ID、姓名;支持get、set方法,要求定义一个toString方法可以返回2个元素的信息。
	private String name;
	private int ID;
	
	public Employee(int ID,String name) {
		this.ID = ID;
		this.name = name;
	}
	public Employee() {
		
	}
	
	public String getName() {
		return name;
	}
	
	public int getID() {
		return ID;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setID(int ID) {
		this.ID = ID;
	}
	
	public String toString() {
		return "该员工姓名为：" + getName() + "ID为：" + getID();
	}
}

package yuangongdaka;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {
	
	public static Company company = new Company();
	public static void main(String[] args) {
		
		
		company.addEmployee(new Employee(5645,"小张"));
		company.addEmployee(new Employee(5646,"小王"));
		company.addEmployee(new Employee(5647,"小李"));
		company.addEmployee(new Employee(5648,"小强"));
		int x = 1;
		while(x==1) {
			System.out.println("----员工打卡系统----");
			System.out.println("输入0--------退出");
			System.out.println("输入1--------签到");
			System.out.println("输入2--------签退");
			System.out.println("输入3--------查看签到信息");
			
			int i = new Scanner(System.in).nextInt();
			switch(i) {
			case 0:{
				x = 0;
				break;
			}
			case 1:{
				System.out.println("请输入签到员工ID:");
				int e1 = new Scanner(System.in).nextInt();
				signIn(e1);
				break;
			}
			case 2 :{
				System.out.println("请输入签到员工ID:");
				int e1 = new Scanner(System.in).nextInt();
				signOut(e1);
				break;
			}
			case 3:{
				showDakainfo();
				break;
			}
			}	
		}
	}
	
	public static void signIn(int i) {
		
		Employee e = company.findEmployee(i);
		if(e == null) {
			System.out.println("无此ID员工");
		}else {
			Date date = new Date();
			SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
			String date1 = sdf1.format(date);
			if(company.getMap().containsKey(date1)) {
				List<Dakainfo> list = company.getMap().get(date1);
				if(list!=null && !list.isEmpty()) {
					for(Dakainfo dk1:list) {
						if(dk1.getID() == i) {
							System.out.println("今天已经打过卡了");
							return;
						}
					}
				}
				Dakainfo dk = new Dakainfo();
				dk.setID(i);
				dk.setStartTime(date);
				list.add(dk);
				System.out.println("卡号：" + dk.getID() + "打卡成功");
			}else {
				List<Dakainfo> list = new ArrayList<Dakainfo>();
				Dakainfo dk = new Dakainfo();
				dk.setID(i);
				dk.setStartTime(date);
				list.add(dk);
				company.getMap().put(date1,list);
				System.out.println("卡号：" + dk.getID() + "打卡成功");
			}

		}
	}
	
	public static void signOut(int i) {
		
		Employee e = company.findEmployee(i);
		if(e==null) {
			System.out.println("无此ID员工");
		}else {
			Date date = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			String date1 = sdf.format(date);
			if(company.getMap().containsKey(date1)) {
				List<Dakainfo> list = company.getMap().get(date1);
				if(list==null && list.isEmpty()) {
					System.out.println("卡号：" + e.getID() + "还没有签到，无法签退");
				}else {
					for(Dakainfo dk1 : list) {
						if(dk1.getID()==i) {
							dk1.setEndTime(date);
							System.out.println("卡号：" + e.getID() + "签退成功");
							return;
						}
					}
					System.out.println("员工未签到");
				}
			}else {
				System.out.println("还未打卡");
			}
		}
	}
	
	public static void showDakainfo() {
		System.out.println("打卡信息如下：");
		SimpleDateFormat sdf2 = new SimpleDateFormat("HH:mm:ss");
		for(Entry<String, List<Dakainfo>> entry:company.getMap().entrySet()) {
			System.out.println(entry.getKey()+"打卡记录如下：");
			for(Dakainfo dk:entry.getValue()) {
				System.out.println("卡号："+dk.getID()+"，签到时间："+sdf2.format(dk.getStartTime())+",签退"
						+ "时间："+(dk.getEndTime()==null?"暂未签退":sdf2.format(dk.getEndTime())));
			}
		}
	}
}



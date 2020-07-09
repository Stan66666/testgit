package yuangongdaka;

import java.util.Date;

public class Dakainfo {
	
	private int ID;
	private Date startTime;
	private Date endTime;
	
	public Dakainfo(int ID,Date startTime,Date endTime) {
		this.ID = ID;
		this.startTime = startTime;
		this.endTime = endTime;
	}
	
	public Dakainfo() {
		
	}

	public int getID() {
		return ID;
	}
	public Date getStartTime() {
		return startTime;
	}
	public Date getEndTime() {
		return endTime;
	}
	
	public void setID(int ID) {
		this.ID = ID;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	
	public String toString() {
		return "卡号：" + getID() + "在" + getStartTime() + "签到，" + "在" + getEndTime() + "签退";
	}
}

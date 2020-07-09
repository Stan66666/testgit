package thread;

public class TestTicket {

	public static void main(String[] args) {
		
		TicketThread tr = new TicketThread();
		Thread t1 = new Thread(tr);
		Thread t2 = new Thread(tr);
		Thread t3 = new Thread(tr);
		
		t1.start();
		t2.start();
		t3.start();
	}

}

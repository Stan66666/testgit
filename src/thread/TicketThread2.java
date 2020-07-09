package thread;

public class TicketThread2 implements Runnable{//extends Thread也可
	
	private int n = 50;//票的数量
	//售票
	public void saleTicket() {
		//同步语句
		synchronized (this) {
			
			if (n > 0) {
				System.out.println(Thread.currentThread().getName() + " No." + n);
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				n--;
			}
		}
	}
	@Override
	public void run() {
		while(true) {
			if(n>0) {
				this.saleTicket();
			}else {
				break;
			}
		}
	}
	
}
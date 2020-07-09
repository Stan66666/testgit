package thread;

//定义线程类，继承Thread父类实现
public class ThreadDemo extends Thread{

	@Override
	//重写父类中run方法
	public void run() {
		//线程做的事情
		for(int i=0;i<20;i++) {
			System.out.println(Thread.currentThread().getName() + ":" + i);//当前正在运行的线程
			System.out.println(i);
			try {
				Thread.sleep(1000);//让线程中止一段时间，单位：毫秒(休眠)
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
}

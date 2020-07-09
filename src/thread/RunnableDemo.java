package thread;

//定义线程类，实现Runnable接口，其余同Thread
public class RunnableDemo implements Runnable{

	@Override
	public void run() {
		
		for(int i=0;i<20;i++) {
//			System.out.println("Thread" + i);
			System.out.println(Thread.currentThread().getName() + ":" + i);//当前正在运行的线程
		}
	}
	
	
}

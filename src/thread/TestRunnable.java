package thread;


public class TestRunnable {

	public static void main(String[] args) {
		
		RunnableDemo rd = new RunnableDemo();
		Thread t = new Thread(rd);//需创建一个Thread对象，将自己创建的线程对象作为参数传递给Thread方法
		t.start();
		for(int i=0;i<20;i++) {
			System.out.println("Main :" + i);
		}
	}

}

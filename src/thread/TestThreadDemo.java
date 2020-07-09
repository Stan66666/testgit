package thread;

public class TestThreadDemo {

	public static void main(String[] args) {
		
		ThreadDemo t1 = new ThreadDemo();
		//使用线程时，调用自己定义的线程对象start方法，激活线程
		t1.start();//调用run方法时不是线程，会先将run方法运行完毕，才接着运行（调用start方法时同时运行）
		for(int i=0;i<20;i++) {
			System.out.println("Main :" + i);

		}
	}

}

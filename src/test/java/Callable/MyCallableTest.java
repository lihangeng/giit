package Callable;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class MyCallableTest implements Callable<Integer> {

	@Override
	public Integer call() throws Exception {
		int i = 0;
		for(;i<100;i++) {
			System.out.println(Thread.currentThread().getName()+"\t"+i);
		}
		return i;
	}
	
	public static void main(String args[]) {
		MyCallableTest test = new MyCallableTest();
		FutureTask<Integer> task = new FutureTask<Integer>(test);
		for(int i=0;i<10000000;i++) {
			System.out.println(Thread.currentThread().getName()+"\t"+i);
			if(i==20) {
				new Thread(task,"callable").start();;
			}
		}
		try {
			System.out.println("callable返回值"+task.get());
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}

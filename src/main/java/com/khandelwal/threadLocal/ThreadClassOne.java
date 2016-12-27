package com.khandelwal.threadLocal;

public class ThreadClassOne extends Thread {

	static InheritableThreadLocal inheritableThreadLocal = new InheritableThreadLocal () {
		
		/*public Object childValue (Object pv) {
			return "ChildThreadValue";
		}*/
	};
	
	@Override
	public void run () {
		
		inheritableThreadLocal.set("ThreadOneValue");
		System.out.println (Thread.currentThread().getName() + " : first sop has threadlocal value as " +inheritableThreadLocal.get());
		ThreadClassTwo threadClassTwo = new ThreadClassTwo();
		threadClassTwo.start();
		System.out.println (Thread.currentThread().getName() + " : second sop has threadlocal value as " +inheritableThreadLocal.get());
	}
}

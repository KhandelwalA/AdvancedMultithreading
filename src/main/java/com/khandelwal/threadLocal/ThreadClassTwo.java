package com.khandelwal.threadLocal;

public class ThreadClassTwo extends Thread {

	@Override
	public void run () {
		
		//ThreadClassOne.inheritableThreadLocal.set("ChildThreadSet");
		System.out.println (Thread.currentThread().getName() + " has threadlocal value as " +ThreadClassOne.inheritableThreadLocal.get());
	}
}

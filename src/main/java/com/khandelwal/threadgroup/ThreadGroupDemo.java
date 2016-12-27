package com.khandelwal.threadgroup;

public class ThreadGroupDemo {

	public static void main(String[] args) {

		ThreadGroup threadGroupOne = new ThreadGroup("ThreadGroupOne");
		Thread threadOne = new Thread(threadGroupOne, "ThreadOne");
		System.out.println("should be main:::"
				+ Thread.currentThread().getName());
		System.out.println("should be ThreadOne:::" + threadOne.getName());
		System.out.println("should be main:::"
				+ threadOne.currentThread().getName());
		System.out.println("should be ThreadGroupOne:::"
				+ threadOne.getThreadGroup().getName());
		System.out.println("should be main thread group:::"
				+ threadOne.getThreadGroup().getParent().getName());
		System.out.println("should be system:::"
				+ threadOne.getThreadGroup().getParent().getParent().getName());

		System.out.println("should be main thread group:::"
				+ Thread.currentThread().getThreadGroup().getParent()
						.activeCount());
		
		System.out.println("should be activeGroupCount of system ThreadGroup:::"
				+ Thread.currentThread().getThreadGroup().getParent()
						.activeGroupCount());
		
		System.out.println("should be activeCount of system ThreadGroup:::"
				+Thread.currentThread().getThreadGroup().getParent().activeCount());
		
		ThreadGroup system = Thread.currentThread().getThreadGroup().getParent();
		Thread[] threadList = new Thread[system.activeCount()];
		system.enumerate(threadList);
		
		for(Thread thread:threadList) {
			System.out.println("Thread name is "+thread.getName()+ " and is this daemon thread and answer is "+ thread.isDaemon());
		}
		
	}

}

package com.khandelwal.locks;

public class ThreadImpl extends Thread {
	
	private String threadName;
	private PrintInformation printInformation;
	public ThreadImpl(String threadName, PrintInformation printInformation) {
		super(threadName);
		this.threadName = threadName;
		this.printInformation = printInformation;
	}
	
	@Override 
	public void run () {
		
		try {
			printInformation.printOnConsole(threadName);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

package com.khandelwal.locks;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class PrintInformation {

	ReentrantLock reentrantLock = new ReentrantLock();

	public void printOnConsole(String name) throws InterruptedException {

		// for (int i = 0; i < 10; i++) {

		if (reentrantLock.tryLock(1000, TimeUnit.MILLISECONDS)) {

			System.out.println(name+" You are welcome");
			Thread.sleep(500);
			System.out.println("Congrats "+name+ " you get hold on resource");
			reentrantLock.unlock();
		} else {
			System.out.println("Sorry " +name+ " you didn't get hold on resource");
		}
		// }

		//System.out.println("hold count is:" + reentrantLock.getHoldCount());

	}
}

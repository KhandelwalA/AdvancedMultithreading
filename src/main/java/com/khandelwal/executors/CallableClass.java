package com.khandelwal.executors;

import java.util.concurrent.Callable;

public class CallableClass implements Callable {

	int nos;

	public CallableClass(int nos) {
		this.nos = nos;
	}

	@Override
	public Object call() throws Exception {

		System.out.print("Current thread is "+Thread.currentThread().getName());
		System.out.print(" and no. sent for square root is :" +nos+" and square root is ");
		return nos * nos;
	}

}

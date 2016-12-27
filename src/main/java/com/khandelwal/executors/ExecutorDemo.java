package com.khandelwal.executors;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorDemo {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		CallableClass[] callableCollection = { new CallableClass(2),
				new CallableClass(3), new CallableClass(4),
				new CallableClass(5), new CallableClass(6),
				new CallableClass(7), new CallableClass(8),
				new CallableClass(9), new CallableClass(10),
				new CallableClass(11), new CallableClass(12),
				new CallableClass(13), new CallableClass(14),
				new CallableClass(15), new CallableClass(16),
				new CallableClass(17), new CallableClass(18) };
		
		ExecutorService executorService = Executors.newFixedThreadPool(3);
		
		for (CallableClass callableClass:callableCollection) {
			@SuppressWarnings({ "unchecked", "rawtypes" })
			Future future = executorService.submit(callableClass);
			System.out.println(future.get());
		}
		executorService.shutdown();
	}
}

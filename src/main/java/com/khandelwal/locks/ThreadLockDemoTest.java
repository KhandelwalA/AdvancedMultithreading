package com.khandelwal.locks;

import java.util.ArrayList;
import java.util.List;

public class ThreadLockDemoTest {

	public static void main(String[] args) {

		PrintInformation printInformation = new PrintInformation();
		List<ThreadImpl> threadImplCollection = new ArrayList<ThreadImpl>();

		for (Integer count = 0; count < 9; count++) {

			threadImplCollection.add(new ThreadImpl(count.toString(),
					printInformation));
		}

		for (ThreadImpl threadImpl : threadImplCollection) {
			threadImpl.start();
		}
	}

}

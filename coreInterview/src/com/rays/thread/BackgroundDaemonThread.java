
package com.rays.thread;

public class BackgroundDaemonThread extends Thread {

	String name ;

	public BackgroundDaemonThread(String name) {
		this.name = name;
	}  

	@Override
	public void run() {

		while (true) {

			try {

				Thread.sleep(1000);

			} catch (InterruptedException e) {

				e.printStackTrace();

			}

			System.out.println(name);
		}
	}
	public static void main(String[] args) {

		BackgroundDaemonThread t1 = new BackgroundDaemonThread("daemon thread");

		t1.setDaemon(true);

		t1.start();

		for (int i = 1; i <= 5; i++) {

			try {

				Thread.sleep(1000);

			} catch (InterruptedException e) {

				e.printStackTrace();

			}

			System.out.println(i + " main");
		}
	}
}
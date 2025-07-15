
package com.rays.thread;

public class PriorityThread extends Thread {
	 String name = null;
	 
	 public PriorityThread(String name) {
		 this.name=name;
		 
	 }
	 @Override
	 public void run() {
		 
		 for (int i = 1; i <= 5; i++) {
			 System.out.println(i + "=" + name);
			
		}
	}
	 
	 public static void main(String[] args) {

			PriorityThread t1 = new PriorityThread("hey");
			PriorityThread t2 = new PriorityThread("hello");

			t1.setPriority(1);
			t2.setPriority(10);

			t1.start();
			t2.start();

		}

}
package com.rays.thread;

public class SharedResource {
	
    private boolean flag = false;
    // Sawan sir ye code nahi banwate h
    // Method where threads will wait
    public synchronized void waitingMethod() {
        System.out.println(Thread.currentThread().getName() + " is waiting...");
        while (!flag) { // Waiting until flag becomes true
            try {
                wait(); // Release the lock and go to the BLOCKED state
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName() + " is resuming...");
    }

    // Method to notify one waiting thread
    public synchronized void notifyOneThread() {
        flag = true;
        notify(); // Wakes up one thread
        System.out.println("Notified one thread.");
    }

    // Method to notify all waiting threads
    public synchronized void notifyAllThreads() {
        flag = true;
        notifyAll(); // Wakes up all threads
        System.out.println("Notified all threads.");
    }



    public static void main(String[] args) {
        SharedResource resource = new SharedResource();

        // Creating multiple threads
        Runnable waitingTask = resource::waitingMethod;

        Thread t1 = new Thread(waitingTask, "Thread-1");
        Thread t2 = new Thread(waitingTask, "Thread-2");
        Thread t3 = new Thread(waitingTask, "Thread-3");

        // Start all threads
        t1.start();
        t2.start();
        t3.start();

        // Give some time for threads to start waiting
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Notify one thread
        new Thread(resource::notifyOneThread, "Notifier-One").start();

        // Give some time before notifying all threads
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Notify all threads
        new Thread(resource::notifyAllThreads, "Notifier-All").start();
    }
}

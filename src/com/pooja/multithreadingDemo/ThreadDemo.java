package com.pooja.multithreadingDemo;

public class ThreadDemo {

	public static void main(String[] args) throws InterruptedException{

		// ThreadDemo t2=new ThreadDemo();

		Thread t1 = new Thread(() -> {
			for (int i = 0; i < 5; i++) {
				System.out.println(Thread.currentThread()+"i am trial");

				try {
					Thread.sleep(500);
				} catch (Exception e) {
					System.err.print("Error");
				}
			}
		});
		Thread t2 = new Thread(() -> {
			for (int i = 0; i < 5; i++) {
				System.out.println(Thread.currentThread()+"i am in run");
				try {
					Thread.sleep(500);
				} catch (Exception e) {
					System.err.print("Error");
				}
			}
		});
		
		t1.setName("Demo Thread");
		t2.setName("Trial Thread");
		System.out.println(t1.getPriority());
		System.out.println(t1.getName());;
		System.out.println(t2.getName());
		System.out.println(t2.getClass());
		System.out.println(t2.getId());
		System.out.println(t1.getId());
		
		System.out.println(t2.getStackTrace());
		t1.start();
		System.out.println(t1.isAlive());

		try {
			Thread.sleep(1000);
		} catch (Exception e) {

		}
		t2.start();
		t1.join();
		t2.join();
		
		System.out.println("My work is end, BYE");

	}
}

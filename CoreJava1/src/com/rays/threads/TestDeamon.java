package com.rays.threads;

public class TestDeamon {
	public static void main(String[] args) {
		Deamon1 d = new Deamon1("dipanshu");

		d.setDaemon(true);
		d.start();
		for (int i = 1; i <= 10; i++) {

			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i + " " + "main");
		}
	}

}

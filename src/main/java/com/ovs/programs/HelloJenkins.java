package com.ovs.programs;

public class HelloJenkins {

	public static void main(String[] args) {
		
		for(int i=0; i<10; i++) {
			System.out.println("Hello, Jenkins!!");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		throw new RuntimeException("Just failing purposefully");
		
	}
}

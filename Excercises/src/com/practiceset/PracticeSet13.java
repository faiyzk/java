package com.practiceset;


//Question 1----------------------------------------------------------------------
//class PracOne extends Thread{
//	public void run() {
//		while(true) {
//			System.out.println("Good Morning!");
//		}
//	}
//}
//
//class PracTwo extends Thread{
//	public void run() {
//		while(true) {
//			System.out.println("Welcome");
//		}
//		
//	}
//}


//Question2----------------------------------------------------------------------------
class PracOne extends Thread{
	public void run() {
		try {
			Thread.sleep(10);
		}
		catch (Exception e ) {
			System.out.println(e);
		}
		System.out.println("Welcome");
		
	}
}

class PracTwo extends Thread{
	public void run() {
		try {
			Thread.sleep(10);
		}
		catch (Exception e ) {
			System.out.println(e);
		}
		System.out.println("Good Morning!");
		
	}
}


public class PracticeSet13 {
	public static void main(String[] args) {
		PracOne p = new PracOne();
		PracTwo p2 = new PracTwo();
		p2.start();
		p.start();

		
//		Question3-------------------------------------------------------
//		p.setPriority(5);
//		p2.setPriority(10);
//		System.out.println(p.getPriority());
//		System.out.println(p2.getPriority());
		
//		Question4--------------------------------------------------------
		System.out.println(p.getState());
		System.out.println(p2.getState());
	}
}
